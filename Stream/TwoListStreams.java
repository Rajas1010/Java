import java.util.*;
import java.util.stream.*;

public class TwoListStreams
{
	public static void main(String args[])
	{
/*
List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

List<Integer> commonElements = list1.stream()
    .filter(list2::contains)
    .collect(Collectors.toList());

System.out.println(commonElements); // Output: [3, 4, 5]


List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

List<Integer> difference = Stream.concat(list1.stream(), list2.stream())
    .distinct()
    .filter(e -> !(list1.contains(e) && list2.contains(e)))
    .collect(Collectors.toList());

System.out.println(difference); // Output: [1, 2, 6, 7]


List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> list2 = Arrays.asList(6, 1, 8, 9, 10);

boolean hasCommonElements = list1.stream()
    .anyMatch(list2::contains);

System.out.println(hasCommonElements); // Output: false


List<Integer> list1 = Arrays.asList(1, 2, 3);
List<Integer> list2 = Arrays.asList(4, 5, 6);

List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream())
    .collect(Collectors.toList());

System.out.println(mergedList); // Output: [1, 2, 3, 4, 5, 6]


List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);

List<Integer> list1WithoutCommonElements = list1.stream()
    .filter(e -> !list2.contains(e))
    .collect(Collectors.toList());

List<Integer> list2WithoutCommonElements = list2.stream()
    .filter(e -> !list1.contains(e))
    .collect(Collectors.toList());
System.out.println(list1WithoutCommonElements); // Output: [1, 2]
System.out.println(list2WithoutCommonElements); // Output: [6, 7]

*/
List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
List<Integer> intersection = list1.stream()
    .filter(list2::contains)
    .collect(Collectors.toList());
System.out.println(intersection); // Output: [3, 4, 5]
/*
*/

	}
}