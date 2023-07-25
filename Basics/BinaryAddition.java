import java.util.*;
public class BinaryAddition
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first value ");
		String a=in.nextLine();
		String b=in.nextLine();
		String c=in.nextLine();
		int p=Integer.parseInt(a,2);
		int q=Integer.parseInt(b,2);
		int r=Integer.parseInt(c,2);
		int sum=p+q+r;
		System.out.println(sum);
		System.out.println(Integer.toBinaryString(sum));
	}
}