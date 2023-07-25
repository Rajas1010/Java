import java.util.*;
import java.util.stream.*;
public class trn
{
	public static void main(String args[])
	{
		/*Scanner in=new Scanner(System.in);
		System.out.println("Enter the int");
		//String s=in.nextLine();
		//List<Integer> xi=Arrays.asList()
		//Integer a[]=Arrays.stream(in.nextLine().trim().split("\\s*(,|\\s)\\s*")).map(Integer::parseInt).toArray(Integer[]::new);
		//List<Integer> n=Arrays.asList(a);
		//System.out.println(n);
		
		//int a[]=Arrays.stream(in.nextLine().trim().split("\\s*(,|\\s)\\s*")).mapToInt(Integer::parseInt).toArray();
		//System.out.println(Arrays.toString(a));
		
		int a[]={1,1,1,2,2,3,4,4,5,6,6,6,7};
		int x=(int)Arrays.stream(a).distinct().count();
		System.out.println(x);
		
		double d=2,t=1;
		int n=-2;
		for(int i=0;i>n;i--)
		{
			t/=d;
			System.out.println(t);
		}
			
		System.out.println(t);
		long n=1073741825;
		 boolean flag=false;
        for(long i=1;i<=n;i*=2)
        {
			System.out.println(i);
            if(i==n)
            {
                flag=true;
                break;
            }
        }
		System.out.println(flag);
        //return flag;
		
		int nums[]={0,1,0,3,12};
		 int a[]=new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                a[k]=nums[i];
                k++;
            }
        }
        System.out.println(a);
		*/
		int nums[]={1,2,3,4};
		 List<Integer> l=new ArrayList<Integer>(nums.length);
		 for(int i : nums)
			 l.add(i);
        for(int i=1;i<=nums.length+1;i++)
        {
            if(!l.contains(i)){
			System.out.println(i);
			break;
			}
        }
	}
}