package Annotation;
public class adv
{
	@MyCustomAnnotation(value=10)
	public void sayHello()
	{
		System.out.println("My custom anno");
	}
	public static void main(String arg[]) throws Exception
	{
		adv h=new adv();
		Method m1=h.getClass().getMethod("sayHello");
		MyCustomAnnotation oAno=m1.getAnnotation(MyCustomAnnotation.class);
		System.out.println("value"+oAno.value());
	}
}