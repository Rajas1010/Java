import java.util.regex.*;
public class RegexQuantifier
{
	public static void main(String args[])
	{
		//occur once
	/*
		  System.out.println(Pattern.matches("a?","a"));//true
		System.out.println(Pattern.matches("a?","aaa"));//false
		System.out.println(Pattern.matches("a?","aaad"));//false
		*/
		
		//more than one time 
	/*
		System.out.println(Pattern.matches("a+","a"));//true
		System.out.println(Pattern.matches("a+","aaa"));//true
		System.out.println(Pattern.matches("a+","aaab"));//false
		
		System.out.println("");
		*/

		//zero or more times
		/*
		System.out.println(Pattern.matches("a*","bc"));//true
		System.out.println(Pattern.matches("a*","a"));//true
		System.out.println(Pattern.matches("a*","aaa"));//true
		System.out.println(Pattern.matches("a*","aabbcc"));//false
	System.out.println("");
		*/
		
		
		//x occur n times
		/*
		System.out.println(Pattern.matches("a{3}","a"));//false
		System.out.println(Pattern.matches("a{3}","aaa"));//true
		System.out.println(Pattern.matches("a{3}","aaaaaa"));//false
		System.out.println("");
			*/
		
		//x occur n or more times
		/*
		System.out.println(Pattern.matches("a{3,}","a"));//false
		System.out.println(Pattern.matches("a{3,}","aaa"));//true
		System.out.println(Pattern.matches("a{3,}","aaaaa"));//true  
		*/
		
		//x occur y to z times
	//	/*
		System.out.println(Pattern.matches("a{3,5}","a"));//false
		System.out.println(Pattern.matches("a{3,5}","aaa"));//true
		System.out.println(Pattern.matches("a{3,5}","aaaaa"));//true
		System.out.println(Pattern.matches("a{3,5}","aaaaaa"));//false
	//	*/
		
		
	}
}