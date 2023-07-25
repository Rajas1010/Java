import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class new1
{
	public static void main(String args[])
	{
		String a="edcba";
		System.out.println(Stream.of(a.split("")).sorted().collect(Collectors.joining()));
		
		
		
	}
}