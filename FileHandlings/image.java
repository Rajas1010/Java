 import java.awt.image.*;
 import java.io.*;
 import java.rmi.*;
 import javax.imageio.*;
 public class image
{
	public static void main(String args[])throws IOException
	{
		int width=963;
		int height=640;
		BufferedImage oImg=null;
		oImg=readFromFile(width,height,oImg);
		writeToFile(oImg);
	}
	public static BufferedImage readFromFile(int width,int height,BufferedImage oImg)
	{
		try
		{
			File oImgFile=new File("C:\\Users\\rasu\\Pictures\\Icon128\\iconDiya.png");
			oImg =new BufferedImage(width,height,BufferedImage.TYPE_INT_ARGB);
			oImg=ImageIO.read(oImgFile);
			System.out.println("Reading complete ;"+oImg);
		}catch(IOException e){System.out.println("Error : "+e);}
		return oImg;
	}
	public static void writeToFile(BufferedImage oImg)
	{
		try
		{
			File oOut=new File("C:\\Users\\rasu\\Pictures\\JavaImage\\imOut.jpg");
			ImageIO.write(oImg,"jpg",oOut);
			System.out.println("writing complete");
		}
		catch(IOException e)
		{System.out.println("Error : "+e);}
	}
}
/*	public static boolean write(RenderedImage oImg,String formatName,File output)throws IOException
	{
		if(output==null)
		{
			throw new IllegalArgumentException("output==null !");
		}
		ImageWriter writer=getWriter(oImg);
	}
}

final class ImageIO
{
	private static final IIORegistry theRegistry=IIORegistry.getDefaultInstance();
	private ImageIO()
	{}
}
*/