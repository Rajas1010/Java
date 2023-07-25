import java.util.*;
import java.util.stream.*;
public class IntStreams
{
	public static void main(String args[])
	{
		Integer a[]={54,56,60,58};
		List<Integer> l1=new ArrayList<Integer>(Arrays.asList(a));
		Integer b[]={54,56,58,60};
		List<Integer> l2=new ArrayList<Integer>(Arrays.asList(b));
		
		System.out.println(l1.equals(l2));
		System.out.println(IntStream.range(0,l1.size()).allMatch(i->Objects.equals(l1.get(i),l2.get(i))));
		
		IntStream.range(0,6).filter(i->i%2==0).forEach(System.out::println);
		System.out.println("");
		IntStream.range(1,5).map(i->i*i).forEach(System.out::println);
		System.out.println("");
		IntStream.range(0,6).boxed().forEach(System.out::println);
		System.out.println("");
		System.out.println(IntStream.range(1,8).average().getAsDouble());
		
		System.out.println(IntStream.of(8,5,45,96,7,84,2,4,56).max());	//use getAsInt()
		IntStream.of(23,54,12,48,62,12,1).distinct().forEach(System.out::println);
		System.out.println("");
		IntStream.of(25,56,15,46,13).sorted().forEach(System.out::println);
		System.out.println("");
		IntStream.range(1,10).limit(5).forEach(System.out::println);
		System.out.println("");
		IntStream.range(1,10).skip(3).forEach(System.out::println);
		System.out.println("");
		IntStream.of(78,52,45,72,14,56).forEach(System.out::println);
		
	}
}