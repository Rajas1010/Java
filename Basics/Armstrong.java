import java.util.*;
public class Armstrong
{
	public static void main(String args[])
	{
		long b=0,s,c=0,a,p;
		Scanner in=new Scanner(System.in);
		long n=in.nextLong();		// 153 , 1634 , 8208  , 548834 , 1741725 , 88593477 ,534494836 , 4679307774 ,
		s=n;									//	28116440335967	,	4338281769391371
		p=(long)(Math.log10(n)+1);  //Find the Length
		while(n!=0)
		{
			a=n%10;
			c+=(long)Math.pow(a,p);
			b=(b*10)+a;
			n/=10;
		}
		if(c==s)
			System.out.println("Armstrong");
		else
			System.out.println("Not Amstrong");

	}
}