import java.util.regex.*;
public class MatcherClass
{
	public static void main(String args[])
	{
		
		Pattern ptn=Pattern.compile(".r.");
		Matcher mchr=ptn.matcher("wrm");
		System.out.println(mchr.matches());
		
	}
}