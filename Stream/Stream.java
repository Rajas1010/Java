//a simple program to demonstrate the use of stream in java
import java.util.*;
import java.util.stream.*;

class Stream
{
public static void main(String args[])
{
	// create a list of String
		List<String> names =Arrays.asList("Reflection","Satyam","Collection","Stream","Sam");
		
	// create a list of integers
		List<Integer> number = Arrays.asList(2,3,4,5);	
		
	// create a list of integers
		List<Integer> numbers = Arrays.asList(2,3,4,5,7,90,90);
		

	// demonstration of map method
	List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	System.out.println(square);
	
	// demonstration of sum method
	System.out.println("sum :"+numbers.stream().mapToInt(Integer::intValue).sum());
	
	

		// demonstration of filter method
		List<String> result = names.stream().filter(s->s.startsWith("S")&&s.endsWith("m")).collect(Collectors.toList());
		System.out.println(result);

		// demonstration of sorted method
		List<String> show =names.stream().sorted().collect(Collectors.toList());
		System.out.println(show);
			
		// collect method returns a set
		Set<Integer> squareSet =numbers.stream().map(x->x*x).collect(Collectors.toSet());
	System.out.println(squareSet);
	
		// demonstration of forEach method
		number.stream().map(x->x*x).forEach(y->System.out.println("forEach :"+y));

		// demonstration of reduce method
		int even =number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		
		
		
		  List<Integer> numbers2 = Arrays.asList(5, 2, 10, 8, 1, 3, 9);
        List<Integer> sortedAndFilteredNumbers = numbers2
                .stream()
                .sorted() // Sort the numbers in ascending order
                .filter(number2 -> numbers.indexOf(number2) != 1) // Remove second element
                .collect(Collectors.toList()); // Collect the results into a new list
				System.out.println(sortedAndFilteredNumbers);
				
					
					
					int x=-121;
		List<Character> chr=Integer.toString(x).chars().mapToObj(n->(char)n).collect(Collectors.toList());
							System.out.println(chr);
		Collections.reverse(chr);
							System.out.println(chr);

		int t=numbers.stream().max(Integer::compareTo).orElse(0);  //get max count
	System.out.println( numbers.stream().filter(n->n==t).count());

	}
	
}
