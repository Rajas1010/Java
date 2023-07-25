enum Color
{
	RED("red"),GREEN("grn"),BLUE("blue");
	private String value;
	Color(String value)
	{
		this.value=value;
	}
	public String getValue()
	{
		return value;
	}
}
public class Enum
{
	public static void main(String arg[])
	{
		Color c1=Color.RED;
		System.out.println("r name "+c1.name());
		System.out.println("r value "+c1.getValue());
		Color c2=Color.GREEN;
		System.out .println("Color Name "+c2.name());
		System.out .println("Color value "+c2.getValue());
		
	}
}