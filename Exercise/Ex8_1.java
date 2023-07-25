//Ex8_1

import java.util.*;
import java.io.*;
class gene<t>
{
	public t add(t a,t b)
	{
		t c=a+b;
		return c;
	}
	public t sub(t a,t b)
	{
		t c=a-b;
		return c;
	}
	public t mul(t a,t b)
	{
		t c=a*b;
		return c;
	}
	public t div(t a,t b)
	{
		t c=a/b;
		return c;
	}
}
public class Ex8_1
{
	public static void main(String args[])
	{
		gene <Integer> obj1=new gene<Integer>();
		gene <Float> obj2=new gene<Float>();
		//gene <String> obj3=new gene<String>();
		System.out.println(obj1.add(5,3));;
		System.out.println(obj1.sub(5,3));
		System.out.println(obj1.mul(5,3));
		System.out.println(obj1.div(5,3));
		/*System.out.println(obj3.add("Mepco","Schlenk"));
		System.out.println(obj3.sub("Mepco","Schlenk"));
		System.out.println(obj3.mul("Mepco","Schlenk"));
		System.out.println(obj3.div("Mepco","Schlenk"));*/
		System.out.println(obj2.add(5.2f,4.2f));
		System.out.println(obj2.sub(5.2f,4.2f));
		System.out.println(obj2.mul(5.2f,4.2f));
		System.out.println(obj2.div(5.2f,4.2f));
	}
}
