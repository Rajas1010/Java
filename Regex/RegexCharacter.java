import java.util.regex.*;
public class RegexCharacter
{
	public static void main(String args[])
	{
		//check only one letter present in the patternMatches
		System.out.println(Pattern.matches("[xyz]","s")); //false
		System.out.println(Pattern.matches("[abc]","abc"));//false
		System.out.println(Pattern.matches("[pqr]","pp"));//false
		System.out.println(Pattern.matches("[pqr]","q"));//true
		System.out.println("");
		
		// check not in the [...] then true
		System.out.println(Pattern.matches("[^abc]","a")); //false
		System.out.println(Pattern.matches("[^abc]","s"));//true
		System.out.println(Pattern.matches("[^abc]","!"));//true
		System.out.println("");
		
		//check the letter in a to z 
		System.out.println(Pattern.matches("[a-z]","s"));//t
		System.out.println(Pattern.matches("[A-Za-z]","H"));//t
		System.out.println(Pattern.matches("[A-Z0-9]","7"));//true
		System.out.println(Pattern.matches("[a-z]","B"));//false
		System.out.println(Pattern.matches("[a-z]","!"));//false
		System.out.println(Pattern.matches("[a-z]","bc"));//false
		System.out.println("");
		
		System.out.println(Pattern.matches("[a-n[m-p]]","c"));//t
		System.out.println(Pattern.matches("[a-n[m-p]]","n"));//t
		System.out.println(Pattern.matches("[a-n[m-p]]","r"));//f
		
		System.out.println("");
		System.out.println(Pattern.matches("[a-z&&[bc]]","b"));//t
		System.out.println(Pattern.matches("[a-z&&[bc]]","d"));//f
		System.out.println(Pattern.matches("[a-z&&[^bc]]","b"));//f
		System.out.println(Pattern.matches("[a-z&&[^bc]]","!"));//f
		System.out.println(Pattern.matches("[a-z&&[^bc]]","h"));          //t
		System.out.println(Pattern.matches("[a-z&&[^m-p]]","n"));       //f
		System.out.println(Pattern.matches("[a-z&&[^m-p]]","b"));       //t
		
	}
}