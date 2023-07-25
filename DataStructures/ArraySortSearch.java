import java.util.*;
public class ArraySortSearch 
{
	static public void main(String args[])
	{
		int a[]={9,8,3,6,2,7,1};
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		Arrays.sort(a);
		System.out.println("");

		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		int index=search(a,8);
		if(index==-1)
			System.out.println("Element not Present");
		else
			System.out.println("Element  Present at "+index);

	}
	public static int search(int array[],int key)
	{
		
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
				return i;
		}
		return -1;
	}
}

