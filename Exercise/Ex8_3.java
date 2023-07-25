//Ex8_3

import java.io.*;
import java.util.*;
class gra<?>
{
	public void grad(? a)
	{
		String str;
		if(a>90)
			str="A";
		else if(a<90 && a>70)
			str="B";
		else if(a<70 && a>50)
			str="C";
		else if(a<50)
			str="D";
	}
}
public class Ex8_3
{
	public static void main(String args[])
	{
		gra <Integer> g=new gra<Integer>;
		g.grad(60);
		gra <Double> gf=new gra<Double>;
		gf.grad(69.5);
	}
}
		
