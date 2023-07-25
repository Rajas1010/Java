import java.util.Arrays.*;
import java.util.*;
import java.util.stream.*;
import java.util.ListIterator;
public class List1 {
    public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		//List inputs
		//List<String> z=Arrays.asList(in.nextLine().split(" "));
		//System.out.println(z);
		List<Integer> list1 = new ArrayList<>();
list1.add(1);
list1.add(2);
list1.add(3);

List<Integer> list2 = new ArrayList<>();
list2.add(4);
list2.add(5);
list2.add(6);

list1.addAll(list2);

System.out.println(list1);


        
/*
        System.out.print("Enter integers separated by spaces, commas, or comma-space: ");
		Integer[] numbers = Arrays.stream(in.nextLine().trim().split("\\s*(,|\\s)\\s*")).map(Integer::parseInt).toArray(Integer[]::new);
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(numbers));
        System.out.println("You entered: " + list);

		
		//immutable
		List<Integer> liim=Arrays.asList(96,85,74);
		
		//mutable
		Integer a[]={52,25,76,99,71,37};
		List<Integer> li=new ArrayList<>(Arrays.asList(a));
		System.out.println(li);
		//else
		List <String> li2=new ArrayList<String>();
		li2.add("raj");
		li2.add("Diya");
		System.out.println(li2);
		
		 //get input from user 
		//length base
		List<Object> lio=new ArrayList<Object>();
		for(int i=0;i<3;i++)
			lio.add(in.next());
		System.out.println(lio);
		
		//dynamic 
		List<Object> lio2=new ArrayList<Object>();
		String s=in.nextLine();
		lio2=Stream.of(s.split(",")).collect(Collectors.toList());
		System.out.println(lio2);
		
		
		System.out.println(li.size());
		
		System.out.println(li.get(2));
		
		
		System.out.println(li.indexOf(52)+" "+li.indexOf(25)+" "+li.indexOf(76));
		
		
		
		//li.clear();
		//System.out.println(li);
		//		System.out.println(li.isEmpty());
			
		li.add(67);
		
		li.add(1,85);
		System.out.println(li);
		
		System.out.println(li.set(1,12));
		//li.set(1,12);
		System.out.println(li);
		
		System.out.println(li.remove(1));
		System.out.println(li);
		
		System.out.println(li.contains(52));
		System.out.println(li.contains(12));
		
		System.out.println(li.isEmpty());
		
		System.out.println(li.subList(2,5));
		
		li.addAll(liim);
		System.out.println(li);
		
		List<Integer> contain=new ArrayList<Integer>();
			contain.add(52);
			contain.add(85);
			contain.add(989);
		System.out.println(li.containsAll(contain));

		List<Integer> rm=new ArrayList<Integer>();
			rm.add(52);
			rm.add(85);
			System.out.println(contain);
		contain.removeAll(rm);
					System.out.println(contain);

		//retainAll
		
		Integer b[]={100,200,300,400,500};
		List<Integer> lis=new ArrayList<>(Arrays.asList(b));
		List<Integer> rt=new ArrayList<Integer>();
			rt.add(100);
			rt.add(400);
			System.out.println("rt :"+rt);
			System.out.println("contain :"+lis);
			
		lis.retainAll(rt);
		System.out.println("after contain:"+lis);
		
		
		Iterator<Integer> it=li.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			System.out.println(i);
		}
		System.out.println("");
		
				ListIterator<Integer> ip=li.listIterator(li.size());
		while(ip.hasPrevious())	
		{
			Integer j=ip.previous();
			System.out.println(j);
		}				
		System.out.println(li);
	Collections.sort(li);
	System.out.println(li);
	Collections.sort(li,Collections.reverseOrder());
	System.out.println(li);

*/
    }
}