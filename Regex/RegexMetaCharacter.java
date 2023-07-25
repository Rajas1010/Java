import java.util.regex.*;
public class RegexMetaCharacter
{
	public static void main(String args[])
	{
		/*
		//if one digit 
		System.out.println(Pattern.matches("\\d", "1"));//t
		System.out.println(Pattern.matches("\\d","123"));//f
		System.out.println(Pattern.matches("\\d","a"));//f
		System.out.println(Pattern.matches("\\D", "1"));//f
		System.out.println(Pattern.matches("\\D","123"));//f
		System.out.println(Pattern.matches("\\D","a"));//t
		System.out.println(Pattern.matches("\\d*","156"));//t
		System.out.println(Pattern.matches("\\D*","abgh"));//t
		System.out.println("");
		
		//if one char or digit
		System.out.println(Pattern.matches(".","a"));//t
		System.out.println(Pattern.matches(".","4"));//t
		System.out.println(Pattern.matches(".","abh"));//f
		System.out.println("");
		System.out.println(Pattern.matches("\\w", "a"));//t
		System.out.println(Pattern.matches("\\w", "@"));//f
		System.out.println(Pattern.matches("\\w","abc"));//f
		System.out.println(Pattern.matches("\\w","1"));//t
		System.out.println(Pattern.matches("\\W", "a"));//f
		System.out.println(Pattern.matches("\\W","abc"));//f
		System.out.println(Pattern.matches("\\W","1"));//t
		System.out.println(Pattern.matches("\\w*","aggk"));//t
		System.out.println(Pattern.matches("\\W*","1235"));//f
		System.out.println("");
		*/
	//	System.out.println(Pattern.matches("\\bcar\\b", "the car colour is red"));//t
		//System.out.println(Pattern.matches("\\b", "@"));//f
		Pattern ptrn=Pattern.compile("\bcar\b");
		Matcher mchr=ptrn.matcher("the car colour is red");
		System.out.println(mchr.matches());
	}
}