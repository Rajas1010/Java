//Ex8_2

import java.util.*;
import java.io.*;
class vol<t>
{
	public void vo(t r)
	{
		double v;
		v=(4/3)*3.14*r*r*r;
		System.out.println("The volume of the sphere is "+v);
	}
	public void surf(t r)
	{
		double s;
		s=4*3.14*r*r;
		System.out.println("The surface area of the cube is "+s);
	}
}
public class Ex8_2
{
	public static void main(String args[])
	{
		vol <Integer>v1=new vol<Integer>();
		vol <Float>v2=new vol<Float>();
		v1.vo(3);
		v1.surf(3);
		v2.vo(3.1f);
		v2.surf(3.1f);
	}
}
		
