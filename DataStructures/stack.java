import java.util.*;

public class stack
{
	public static void main(String args[])
	{
		try{
		Scanner in=new Scanner(System.in);
		Stack<Integer> stk =new Stack<>();
		//int b=in.nextInt();
		String x="";
		String s="";
		int b,c=0;
		while(true)
		{
		System.out.println("(1)Push,(2)Pop,(3)Peek,(4)isEmpty,(5)Search,(6)Sort(7)Iterate,(8)Exit");
		s=in.nextLine();
			if(s.equals("1")||s.equals("5"))
			{
				System.out.println("Enter the value : ");
				x=in.nextLine();
				s+=","+x;
			}
				if(s.charAt(0)=='5'||s.charAt(0)=='1')
				{
					x=s.substring(2);
					s=Character.toString(s.charAt(0));
					c=Integer.parseInt(x);
				}
			
				b=Integer.parseInt(s);
		switch(b)
				{
					case 1:
					{
						stk.push(c);
						System.out.println(stk);
						break;
					}case 2:
					{
						stk.pop();
						System.out.println(stk);
						break;
					}case 3:
					{
						System.out.println(stk.peek());
						break;
					}case 4:
					{
						System.out.println(stk.isEmpty());
						break;
					}case 5:
					{
						System.out.println(stk.search(c));
						break;
					}case 6:
					{
						stk.sort(null);
						System.out.println(stk);
						break;
					}case 7:
					{
						Iterator it=stk.iterator();
						while(it.hasNext())
						{
							Object ob=it.next();
							System.out.println(ob);
						}
						break;
					}case 8:
					{
						System.exit(0);
						//sk.close();
					}
				}
		}
		}catch(Exception e){}
	}
}