import java.util.Arrays.*;
import java.util.*;
import java.util.stream.*;
import java.util.ListIterator;
public class trn {
	static String type(boolean n){return "Boolean";}
	static String type(byte n){return "Byte";}
	static String type(char n){return "Character";}
	static String type(short n){return "Short";}
	static String type(int n){return "Integer";}
	static String type(float n){return "Float";}
	static String type(long n){return "Long";}
	static String type(double n){return "Double";}
	static String type(String n){return "String";}
	static String type(Object n){return "Object";}
    public static void main(String[] args) {
	/*	
		Scanner in=new Scanner(System.in);
		//immutable
		List<Integer> liim=Arrays.asList(96,85,74);
		
		//mutable
		Integer a[]={52,25,76,99,71,37};
		List<Integer> li=new ArrayList<>(Arrays.asList(a));
		
		System.out.println(li);
		
		List <String> li2=new ArrayList<String>();
		li2.add("raj");
		li2.add("Diya");
		System.out.println(li2);
		
		List<Object> lio=new ArrayList<Object>();
		for(int i=0;i<3;i++)
			lio.add(in.next());
		System.out.println(lio);
		
		
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


    
	
	List<String> l1=new ArrayList<String>();
	l1.add("phone");
	l1.add("blue");
	l1.add("pixel");
	List<String> l2=new ArrayList<String>();
	l1.add("computer");
	l1.add("silver");
	l1.add("phone");
	List<String> l3=new ArrayList<String>();
	l1.add("phone");
	l1.add("gold");
	l1.add("iphone");
	List<List> items=new ArrayList<List>();
	items.add(l1);
	items.add(l2);
	items.add(l3);
	String ruleKey="name";
	String ruleValue="phone";
        int index=0,c=0;
        if(ruleKey=="type") index=0;
        else if(ruleKey=="color") index=1;
        else if(ruleKey=="name") index=2;
System.out.println(index);
System.out.println(items.get(1));

       /* for(List li:items)
        {
           
        }
        System.out.println(c);
    */


    }
}