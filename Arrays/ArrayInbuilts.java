import java.util.*;
import java.util.stream.*;

public class ArrayInbuilts
{
	public static void main(String args[])
	{
		
		//1 sort Asc Desc
		Integer[] numbers = {5, 3, 1, 4, 2};
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers,Collections.reverseOrder());
		System.out.println(Arrays.toString(numbers));
/*
		//2binarySearch
		int[] numbers = {4,5,6,7,0,1,2};
		int index = Arrays.binarySearch(numbers, 7); // index = 2
		System.out.println(index);
		
		//3equals: 
		int[] a = {1, 2, 3};
		int[] b = {1, 2, 3};
		boolean isEqual = Arrays.equals(a, b); // isEqual = true
	
		//4toString
		int[] numbers = {1, 2, 3, 4, 5};
		String str = Arrays.toString(numbers); // str = "[1, 2, 3, 4, 5]"
		
		//5asList
		String[] names = {"John", "Jane", "James"};
		List<String> list = Arrays.asList(names);
	
		//6hashCode
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int hash = Arrays.hashCode(numbers);
		System.out.println(hash);
			
		//7stream
		int[] numbers = {1, 2, 3, 4, 5};
		IntStream stream = Arrays.stream(numbers);
		System.out.println(stream);
		
		//8parallelPrefix
		int[] numbers = {1, 2, 3, 4, 5};
		Arrays.parallelPrefix(numbers, (x, y) -> x * y); // numbers = {1, 2, 6, 24, 120}
		
		//9parallelSetAll
		int[] numbers = new int[5];
		Arrays.parallelSetAll(numbers, i -> i * 2); // numbers = {0, 2, 4, 6, 8}
		
		//10parallelSort:
		int[] numbers = {5, 3, 1, 4, 2};
		Arrays.parallelSort(numbers); // numbers = {1, 2, 3, 4, 5}
		
		//11setAll:
		int[] numbers = new int[5];
		Arrays.setAll(numbers, i -> i * 2); // numbers = {0, 2, 4, 6, 8}
		
		//12spliterator
		int[] numbers = {1, 2, 3, 4, 5};
		Spliterator.OfInt spliterator = Arrays.spliterator(numbers);
		
		//13fill
		int[] numbers = new int[5];
		Arrays.fill(numbers, 0); // numbers = {0, 0, 0, 0, 0}

		//14copyOf:
		int[] numbers = {1, 2, 3, 4, 5};
		int[] copy = Arrays.copyOf(numbers, 3); // copy = {1, 2, 3}
		
		//15copyOfRange
		int[] numbers = {1, 2, 3, 4, 5};
		int[] copy = Arrays.copyOfRange(numbers, 2, 4); // copy = {3, 4}
		
		//16deepToString
		int[][] numbers = {{1, 2}, {3, 4}, {5, 6}};
		System.out.println(Arrays.deepToString(numbers));
		
		//17deepHashCode
		int[][] numbers1 = {{1, 2}, {3, 4}, {5, 6}};
		int[][] numbers2 = {{1, 2}, {3, 4}, {5, 6}};
		int[][] numbers3 = {{1, 2}, {3, 4}, {5, 7}};
		
		int hash1 = Arrays.deepHashCode(numbers1);
		int hash2 = Arrays.deepHashCode(numbers2);
		int hash3 = Arrays.deepHashCode(numbers3);
		
		System.out.println("hash1: " + hash1);
		System.out.println("hash2: " + hash2);
		System.out.println("hash3: " + hash3);
		
		//18deepEquals
		int[][] numbers1 = {{1, 2}, {3, 4}, {5, 6}};
		int[][] numbers2 = {{1, 2}, {3, 4}, {5, 6}};
		int[][] numbers3 = {{1, 2}, {3, 4}, {5, 7}};
		
		boolean isEqual1 = Arrays.deepEquals(numbers1, numbers2);
		boolean isEqual2 = Arrays.deepEquals(numbers1, numbers3);
		
		System.out.println("isEqual1: " + isEqual1);
		System.out.println("isEqual2: " + isEqual2);
		
		
		//19setMemory
		byte[] bytes = new byte[10];
		Arrays.setMemory(bytes, 0, bytes.length, (byte) 0);
		System.out.println(Arrays.toString(bytes));
			
	*/
		//20 join array (arraycopy)
		int a1[]= {1, 2, 3, 4, 5};
		int a2[]={24, 25, 26};
		int c[]=new int[a1.length+a2.length];
		System.arraycopy(a1, 1, c, 1, 4);
		System.out.println(Arrays.toString(c));
	/*
		
		//21 Search index
		 int[] numbers = {5, 10, 15, 20, 25};

        int target = 15;
		List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));

        int index = numberList.indexOf(target);
        if (index >= 0) {
            System.out.println("Index of " + target + ": " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
*/
/*






System.out.println(isEqual);
//System.out.println(Arrays.toString(numbers));
*/



	}
}