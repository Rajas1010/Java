import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import java.io.*;
import java.net.*;
import java.util.*;
class Obstacle {
    int x, y, width, height;
    Rectangle topPipe, bottomPipe;
    int distance = 105;
    boolean isPassedOn = false;

    public Obstacle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        topPipe = new Rectangle(x, y, width, height);
        bottomPipe = new Rectangle(x, height + distance, width, height);
    }

    public void resetToNewPosition(int newX) {
        topPipe.x = newX;
        bottomPipe.x = newX;
        x = newX;
        topPipe.y = -(new Random().nextInt(140) + 100);
        bottomPipe.y = topPipe.y + height + distance;
        isPassedOn = false;
    }

    public boolean intersect(Rectangle rectangle) {
        return rectangle.intersects(topPipe) || rectangle.intersects(bottomPipe);
    }

    public boolean passedOn(Rectangle rectangle) {
        return rectangle.x > x + width && !isPassedOn;
    }

    public void moveX(int dx) {
        x -= dx;
        topPipe.x -= dx;
        bottomPipe.x -= dx;
    }
}

enum Direction {
    Up,
    Down,
    None
}

public class trn extends JPanel implements Runnable, MouseListener {

    boolean isRunning;
    Thread thread;
    BufferedImage view, background, floor, bird, tapToStartTheGame;
    BufferedImage[] flyBirdAmin;
    Rectangle backgroundBox, floorBox, flappyBox, tapToStartTheGameBox;
static DataOutputStream odos;
static DataInputStream odis;
    int DISTORTION;
    int SCALE = 2;
    int SIZE = 256;

    int frameIndexFly = 0, intervalFrame = 5;
    Direction direction;
    float velocity = 0;
    float gravity = 0.5f;
    boolean inGame;
    BufferedImage topPipe, bottomPipe;
    Obstacle[] obstacles;
    Font font;
    int record = 0;
    int point = 0;
    static String pass;
   

    public trn() {
        SIZE *= SCALE;
        setPreferredSize(new Dimension(SIZE, SIZE));
        addMouseListener(this);
		System.out.println(a);
    }

    public static void main(String[] args) throws Exception 
	{
		try
		{
					trn.starting();

		}catch(Exception e)
		{System.out.println("exception");}
    }
	public static void starting() throws Exception 
	{
		try
		{
		ServerSocket s=new ServerSocket(8877);
			Socket sk=s.accept();
			System.out.println("Connected");
			 odos=new DataOutputStream(sk.getOutputStream());

		   odis=new DataInputStream(sk.getInputStream());
			String s1=(String)odis.readUTF();
			JFrame w = new JFrame("Bouncing Ball");
			w.setResizable(false);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			w.add(new trn());
			w.pack();
			w.setLocationRelativeTo(null);
			w.setVisible(true);
			while(true)
			{
							
			odos.writeUTF(pass);
			}

			//sk.close();
			//s.close();
		
		}catch(EOFException exp){}
	}
	public static void starting(String str1) throws Exception 
	{
		
	}

    @Override
    public void addNotify() {
        super.addNotify();
        if (thread == null) {
            thread = new Thread(this);
            isRunning = true;
            thread.start();
        }
    }

    public void start() {
        try {
            view = new BufferedImage(SIZE, SIZE, BufferedImage.TYPE_INT_RGB);
            //background = ImageIO.read(getClass().getResource("/background.png"));
            background = ImageIO.read(getClass().getResource("/back.png"));
            floor = ImageIO.read(getClass().getResource("/floor2.png"));
            tapToStartTheGame = ImageIO.read(getClass().getResource("/tap_to_start_the_game.png"));
           //  BufferedImage fly = ImageIO.read(getClass().getResource("/flappy_sprite_sheet.png"));
             BufferedImage fly = ImageIO.read(getClass().getResource("/BallSpriteSheet.png"));
		   
          //  topPipe = ImageIO.read(getClass().getResource("/top_pipe.png"));
           topPipe = ImageIO.read(getClass().getResource("/top.png"));
           // bottomPipe = ImageIO.read(getClass().getResource("/bottom_pipe.png"));
            bottomPipe = ImageIO.read(getClass().getResource("/bottom.png"));

           // flyBirdAmin = new BufferedImage[3];
           // for (int i = 0; i < 3; i++) {
           //     flyBirdAmin[i] = fly.getSubimage(i * 17, 0, 17, 12);
           // }
           // bird = flyBirdAmin[0];
			
			flyBirdAmin = new BufferedImage[4];
            for (int i = 0; i < 4; i++) {
                flyBirdAmin[i] = fly.getSubimage(i * 12, 0, 12, 13);
            }
            bird = flyBirdAmin[0];

            DISTORTION = (SIZE / background.getHeight());

            obstacles = new Obstacle[4];
            startPositionObstacles();

            int widthTapStartGame = tapToStartTheGame.getWidth() * DISTORTION;
            int heightTapStartGame = tapToStartTheGame.getHeight() * DISTORTION;
            tapToStartTheGameBox = new Rectangle(
                    (SIZE / 2) - (widthTapStartGame / 2),
                    (SIZE / 2) - (heightTapStartGame / 2),
                    widthTapStartGame,
                    heightTapStartGame
            );
            flappyBox = new Rectangle(
                    0,
                    0,
                    bird.getWidth() * DISTORTION,
                    bird.getHeight() * DISTORTION
            );
            backgroundBox = new Rectangle(
                    0,
                    0,
                    background.getWidth() * DISTORTION,
                    background.getHeight() * DISTORTION
            );
            floorBox = new Rectangle(
                    0,
                    SIZE - (floor.getHeight() * DISTORTION),
                    floor.getWidth() * DISTORTION,
                    floor.getHeight() * DISTORTION
            );

            startPositionFlappy();

            font = new Font("TimesRoman", Font.BOLD, 16 * DISTORTION);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void startPositionObstacles() {
        for (int i = 0; i < 4; i++) {
            obstacles[i] = new Obstacle(0, 0, topPipe.getWidth() * DISTORTION, topPipe.getHeight() * DISTORTION);
            obstacles[i].resetToNewPosition((SIZE + topPipe.getWidth() * DISTORTION) + (i * 170));
        }
    }

    public void startPositionFlappy() {
        direction = Direction.None;
        inGame = false;
        flappyBox.x = (SIZE / 2) - (flappyBox.width * 3);
        flappyBox.y = (SIZE / 2) - flappyBox.height / 2;
    }

    public void update()throws Exception {
        backgroundBox.x -= 1;
        floorBox.x -= 3;

        if (backgroundBox.x + backgroundBox.getWidth() <= 0) {
            backgroundBox.x = (int) (backgroundBox.x + backgroundBox.getWidth());
        }

        if (floorBox.x + floorBox.getWidth() <= 0) {
            floorBox.x = (int) (floorBox.x + floorBox.getWidth());
        }

        intervalFrame++;
        if (intervalFrame > 5) {
            intervalFrame = 0;
            frameIndexFly++;
            if (frameIndexFly > 2) {
                frameIndexFly = 0;
            }
            bird = flyBirdAmin[frameIndexFly];
        }

        if (inGame) {
            for (Obstacle obstacle : obstacles) {
                obstacle.moveX(3);

                if (obstacle.x + obstacle.width < 0) {
                    obstacle.resetToNewPosition(SIZE + obstacle.width + 65);
                }

                if (obstacle.intersect(flappyBox)) {
                    gameOver();
                }

                if (obstacle.passedOn(flappyBox)) {
                    obstacle.isPassedOn = true;
                    point++;
					//System.out.println(point);
                    if (point > record) {
                        record = point;
					
                    }
						if(point>a)
					{
						//System.out.println(point);
						if(!inGame)
						{
							pass=Integer.toString(point);
							//System.out.println("  pas :"+pass);
						a=0;
						}
					}
                }
            }
        }
        if (direction == Direction.Down) {
            velocity += gravity;
            flappyBox.y += velocity;
        } else if (direction == Direction.Up) {
            velocity = -2.5f;
            flappyBox.y -= -velocity;
        }

        if (flappyBox.y + flappyBox.getHeight() >= SIZE - floorBox.height || flappyBox.y <= 0) {
            gameOver();
        }
    }

    public void gameOver() throws Exception {
        try
		{
			String pnt=Integer.toString(point);
			System.out.println(point);
			odos.writeUTF(pnt);
		}catch(Exception e)
		{
			odos.close();
			System.out.println("exception");}
		point = 0;
        startPositionObstacles();
        startPositionFlappy();
		
    }
	public int a;
    public void draw() {
        Graphics2D g2 = (Graphics2D) view.getGraphics();
        g2.drawImage(
                background,
                backgroundBox.x,
                backgroundBox.y,
                (int) backgroundBox.getWidth(),
                (int) backgroundBox.getHeight(),
                null
        );
        g2.drawImage(
                background,
                (int) (backgroundBox.x + backgroundBox.getWidth()),
                backgroundBox.y,
                (int) backgroundBox.getWidth(),
                (int) backgroundBox.getHeight(),
                null
        );

        for (Obstacle obstacle : obstacles) {
            g2.drawImage(topPipe, obstacle.x, obstacle.topPipe.y, obstacle.width, obstacle.height, null);
            g2.drawImage(bottomPipe, obstacle.x, obstacle.bottomPipe.y, obstacle.width, obstacle.height, null);
        }

        g2.drawImage(
                floor,
                floorBox.x,
                floorBox.y,
                (int) floorBox.getWidth(),
                (int) floorBox.getHeight(),
                null
        );
        g2.drawImage(
                floor,
                (int) (floorBox.x + floorBox.getWidth()),
                floorBox.y,
                (int) floorBox.getWidth(),
                (int) floorBox.getHeight(),
                null
        );

        g2.drawImage(
                bird,
                flappyBox.x,
                flappyBox.y,
                (int) flappyBox.getWidth(),
                (int) flappyBox.getHeight(),
                null
        );

        if (!inGame) {
            g2.drawImage(
                    tapToStartTheGame,
                    tapToStartTheGameBox.x,
                    tapToStartTheGameBox.y,
                    (int) tapToStartTheGameBox.getWidth(),
                    (int) tapToStartTheGameBox.getHeight(),
                    null
            );
        }

        g2.setColor(Color.YELLOW);
        g2.setFont(font);
        if (!inGame) {
            g2.drawString("Record: " + record, 10, 35);
			this.a=record;
        } else {
            g2.drawString(point + "", SIZE - 180, 35);
        }
        Graphics g = getGraphics();
        g.drawImage(view, 0, 0, SIZE, SIZE, null);
		//if(inGame)
		//	System.out.println(a);
        g.dispose();
    }


	
    @Override
    public void run() {
        try {
            requestFocus();
            start();
			int b=0;
            while (isRunning) {
                update();
                draw();
                Thread.sleep(2500 / 60);
            }	
		
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        direction = Direction.Up;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        inGame = true;
        direction = Direction.Down;
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
