 import java.util.*;
 import java.io.*;
import java.math.*;
 public class countDigit
 {
 	public static void main(String args[])
 	{
 		String s="bb1,kl46+f54n_2mc.25ta t3k;j35<bj/b1 35";
		byte count=0;
		for(char a : s.toCharArray())
			if(Character.isDigit(a))
				count++;
	System.out.println(count);
		
 	}
 }