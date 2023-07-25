import java.util.Scanner;
public class Solution {
	
    static boolean isAnagram(String a, String b) {
		if(a.length()==b.length())
		{
        java.util.List c= java.util.Arrays.stream(a.toLowerCase().split("")).sorted().collect(java.util.stream.Collectors.toList());
        java.util.List d= java.util.Arrays.stream(b.toLowerCase().split("")).sorted().collect(java.util.stream.Collectors.toList());
		return java.util.stream.IntStream.range(0 , c.size()).allMatch(i->c.get(i).equals(d.get(i)));
		}
		else
			return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}