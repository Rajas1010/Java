import java.util.*;
import java.io.*;
import java.math.*;
import java.util.stream.*;
public class CONVERSION
{
	static String type(boolean n){return "Boolean";}
	static String type(byte n){return "Byte";}
	static String type(char n){return "Character";}
	static String type(short n){return "Short";}
	static String type(int n){return "Integer";}
	static String type(float n){return "Float";}
	static String type(long n){return "Long";}
	static String type(double n){return "Double";}
	static String type(String n){return "String";}
	static String type(Object n){return "Object";}
	
	public static void main(String args[])throws Exception
	{
		Scanner in=new Scanner(System.in);
		//Scanner value=new Scanner("hello World Welcome to our Tech");
		//System.out.println(value);
		
		//primitive Data types	
		boolean b=true;											// true or false (1 bit)
		byte t=102;												//-128 to 127 (1 byte)
		char c='a';												//Single char And Ascii Values (2 byte)
		short h=100;											// -32768 to 32767 (2 byte)
		int i=65;												//-2,147,483,648,to2,147,483,647 (4 byte)
		float f=102.03f;										//decimal 6 to 7 (4 byte)
		long l=110L;											//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807(8 byte)
		double d=12.5622;										//decimal of 15 digits (8 byte)
		
		//non primitive Data types
		String s="12";
		String s1="Raman";
		String s2="Raman is a football player";
		String a[];
		StringBuffer sb=new StringBuffer("hello i am stringBuffer");
		Object ob="hello World Welcome to </> School";
		
	/*______________________________________________________________*/
		
		/*boolean to ..*/

		//System.out.println(String.valueOf(b)+"\ntype : "+type(String.valueOf(b)));
		
	/*______________________________________________________________*/

		/*byte to ..*/
		//System.out.println((short)t+" Type: "+type((short)t));											//	Byte To Short
		//System.out.println((char)t+" Type: "+type((char)t));												//	Byte To Char
		//System.out.println((int)t+" Type: "+type((int)t));												//	Byte To Int
		//System.out.println((float)t+" Type: "+type((float)t));											//	Byte To Float
		//System.out.println((long)t+" Type: "+type((long)t));												//	Byte To Long
		//System.out.println((double)t+" Type: "+type((double)t));											//	Byte To Double
		//System.out.println(String.valueOf(t)+" Type: "+type(String.valueOf(t)));							//	Byte To String
		//System.out.println(Integer.toString(t)+" Type: "+type(Integer.toString(t)));						//	Byte To String
	/*______________________________________________________________*/

		/*char to ..*/
		
		//System.out.println((double)c+" Type: "+type((double)c));											//Char To Double
		//System.out.println((byte)c+" Type: "+type((byte)c));												//Char To Byte
		//System.out.println((short)c+" Type: "+type((short)c));											//Char To Short
		//System.out.println((int)c+" Type: "+type((int)c));												//Char To Int
		//System.out.println((float)c+" Type: "+type((float)c));											//Char To Float
		//System.out.println((long)c+" Type: "+type((long)c));												//Char To Long
		//System.out.println(Character.toString(c)+" Type: "+type(Character.toString(c)));					//Char To String
		
		//System.out.println(Character.isDigit('5'));														// Check Char is Digit
		//System.out.println(Character.isLetter('5'));														//Check Char is Litter
		//System.out.println(Character.getNumericValue('*'));												//give char numeric value a to z give 10 to 35 &0 to 9 give same else -1
		
		
	/*______________________________________________________________*/    

		/*short to ..*/
		
		//System.out.println((byte)h+" Type: "+type((byte)h));												//	Short To Byte
		//System.out.println((char)h+" Type: "+type((char)h));												//	Short To Char
		//System.out.println((int)h+" Type: "+type((int)h));												//	Short To Int
		//System.out.println((float)h+" Type: "+type((float)h));											//	Short To Float
		//System.out.println((long)h+" Type: "+type((long)h));												//	Short To Long
		//System.out.println((double)h+" Type: "+type((double)h));											//	Short To Double
		//System.out.println(String.valueOf(h)+" Type: "+type(String.valueOf(h)));							//	Short To String
		//System.out.println(Integer.toString(h)+" Type: "+type(Integer.toString(h)));						//	Short To String
	/*______________________________________________________________*/

		/*Integer to ..*/
		
		//System.out.println((byte)i+" Type: "+type((byte)i));												//	Integer To Byte
		//System.out.println((char)i+" Type: "+type((char)i));												//	Integer To Char
		//System.out.println((short)i+" Type: "+type((short)i));											//	Integer To Short
		//System.out.println((float)i+" Type: "+type((float)i));											//	Integer To Float
		//System.out.println((long)i+" Type: "+type((long)i));												//	Integer To Long
		//System.out.println((double)i+" Type: "+type((double)i));											//	Integer To Double
		//System.out.println(Integer.toString(i)+" Type: "+type(Integer.toString(i)));						//	Integer To String				
		//System.out.println(4<<3); 																		//num doubles times

	/*______________________________________________________________*/
	
		/*float to ..*/
		
		//System.out.println((byte)f+" Type: "+type((byte)f));												//	Float To Byte
		//System.out.println((char)f+" Type: "+type((char)f));												//	Float To Char
		//System.out.println((short)f+" Type: "+type((short)f));											//	Float To Short									
		//System.out.println((int)f+" Type: "+type((int)f));												//	Float To Integer
		//System.out.println((long)f+" Type: "+type((long)f));												//	Float To Long
		//System.out.println((double)f+" Type: "+type((double)f));											//	Float To Double
		//System.out.println(String.valueOf(f)+" Type: "+type(String.valueOf(f)));							//	Float To String
	/*______________________________________________________________*/

		/*long to ..*/
		
		//System.out.println((byte)l+" Type: "+type((byte)l));												//	Long To Byte
		//System.out.println((short)l+" Type: "+type((short)l));											//	Long To Char
		//System.out.println((char)l+" Type: "+type((char)l));												//	Long To Short	
		//System.out.println((int)l+" Type: "+type((int)l));												//	Long To Integer
		//System.out.println((float)l+" Type: "+type((float)l));											//	Long To Float
		//System.out.println((double)l+" Type: "+type((double)l));											//	Long To Double
		//System.out.println(String.valueOf(l)+" Type: "+type(String.valueOf(l)));							//	Long To String
	/*______________________________________________________________*/

		/*double to ..*/
		
		//System.out.println((byte)d+" Type: "+type((byte)d));												//	Double To Byte
		//System.out.println((short)d+" Type: "+type((short)d));											//	Double To Char
		//System.out.println((char)d+" Type: "+type((char)d));												//	Double To Short	
		//System.out.println((int)d+" Type: "+type((int)d));												//	Double To Integer
		//System.out.println((float)d+" Type: "+type((float)d));											//	Double To Float
		//System.out.println((long)d+" Type: "+type((long)d));												//	Double To Long
		//System.out.println(String.valueOf(d)+" Type: "+type(String.valueOf(d)));							//	Double To String
	/*______________________________________________________________*/

		/*String to ..*/	//	https://www.javatpoint.com/java-string
		
		//byte []bt=s2.getBytes();																			//use ascii value conversion string to byte array(ascii)
		//System.out.println(Arrays.toString(bt));															//	String To ByteArray
		//System.out.println(s.charAt(0)+" Type: "+type(s.charAt(0)));										//	String To Char
		//System.out.println(Short.valueOf(s)+" Type: "+type(Short.valueOf(s)));							//	String To Short	
		//System.out.println(Integer.parseInt(s)+" Type: "+type(Integer.parseInt(s)));						//	String To Integer
		//System.out.println(Long.parseLong(s)+" Type: "+type(Long.parseLong(s)));							//	String To Float
		//System.out.println(Float.parseFloat(s)+" Type: "+type(Float.parseFloat(s)));						//	String To Long
		//System.out.println(Double.parseDouble(s)+" Type: "+type(Double.parseDouble(s)));					//	String To Double

		//System.out.println((int)(s2.chars().filter(ch -> ch == 'a').count()));    	//Occurence of the given char in String
		//System.out.println(s2.substring(5));											//print except first 5 char
		//System.out.println(s2.substring(2,5));										//print index2 to 5th position value
		//System.out.println(s2.indexOf("i"));											//to get the index position of giver char
		//System.out.println(s1.equals("Raman"));										// check the string
		//System.out.println(s1=="Raman");												// check the string
		//System.out.println(String.format("%8d",101));									//put the 5 space then print 101
		//System.out.println(s1.contains("man"));										//s1=Raman ;o/p true
		//System.out.println(s.concat(s1));												//print 2 string
		//System.out.println(s1.endsWith("n"));											//return boolean 
		//System.out.println(s1.indexOf("a"));											//get Index of the char -1 means not found
		//System.out.println(s2.indexOf("is"));											//get Index of the char first letter
		
		/*	??
			while(in.hasNext())
			{
				String s3=in.next();
				if("end".equals(s3));
				{
					in.useDelimiter("end");
				}
				log.info(s3);
			}log.info("END ..!");
			System.out.println(value.delimiter( ));
		*/
		
		/*Object To String */

		//System.out.println(ob.toString());
	/*______________________________________________________________*/

		/*StringBuffer Handlings*/
		/* 
			sb.setCharAt(2,'z');																				//to change the one char in the string using index position
			System.out.println(sb);
		*/
	/*______________________________________________________________*/

		/*Binary Handlings*/
		
		//System.out.println(Integer.parseInt("1010",2));																//Binary to Decimal
		//System.out.println(Integer.toBinaryString(15));																//Decimal to Binary
		//System.out.println(Integer.parseInt("23",8));																	//Octal to Decimal
		//System.out.println(Integer.toOctalString(9));																	//Decimal to Octal
		//System.out.println(Integer.parseInt("b",16));																	//Hex to Decimal
		//System.out.println(Integer.toHexString(13));																	//Decimal to Hex
		//System.out.println(Integer.toBinaryString(Integer.parseInt("f",16)));								//Hex to Binary
		//System.out.println(Integer.toHexString(Integer.parseInt("1010",2))); 								//Binary to Hex
		
	/*______________________________________________________________*/
	
	/*Arrays*/		// https://www.javatpoint.com/array-in-java
	
	/* 
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		a=bf.readLine().split(" ");																				//input to array using space
		System.out.println(Arrays.toString(a));																	//must throw Exception
	*/																
	
	/* 	
		String []ar=s2.split("(?<=\\G.{"+8+"})");				//string split into 8 char to array 		//array variable don`t declere initially
		System.out.println(Arrays.toString(ar));				//print the hole array
	*/
	 /* 
		int ai[]={1,2,3,4,5,6,7,8,9};
		String str=Arrays.toString(ai).replaceAll("\\s","");												//int array to string and remove space each index
		System.out.println(str+" Type: "+type(str));
	*/
	 /* 
		String as[]={"1","2","3","4","5"};																	//string array to int Array 
		int i2[]=Arrays.stream(as).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(i2));
	*/
	/*
		String str= "[1,2,9,89,567,56,43]";
		int[] arr=Stream.of(str.replaceAll("[\\[\\]]","").split(",")).mapToInt(Integer::parseInt).toArray();		//string  to int array remove [ ]
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	*/
	/*
		String str="HoLlYWoOd";
		String a[]=str.split("");
		Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
		Arrays.stream(a).forEach(System.out::print); 
	  */

	/* 
	Scanner scanner = new Scanner(System.in);
	String [] tokens={};
    	while (scanner.hasNextLine())
    	{
    	    tokens= scanner.nextLine().split("\n");
    	    System.out.println(Arrays.toString(tokens));
			if (tokens[0]=="end")
				break;
    	}
		System.out.println("tkn"+Arrays.toString(tokens));
    	scanner.close();
	*/

	/*______________________________________________________________*/
		
	/*Math functions*/	//	https://www.javatpoint.com/java-math

		/*
			for(i=0;i<10;i++)
			{
				System.out.println((int)Math.pow(2,i));		//power function
			}
		*/
	/*______________________________________________________________*/
		
	/*Regex*/	// https://www.javatpoint.com/java-regex
	
	
	/*______________________________________________________________*/
		
	/*List or ArrayList*/	// https://www.javatpoint.com/java-arraylist
	
	
	/*______________________________________________________________*/
		
	/*Stream functions*/	
	
		String seq="edcba";
		System.out.println(Stream.of(seq.split("")).sorted().collect(Collectors.joining()));
		
	/*______________________________________________________________*/

	}
}

	//String functions
	/*
	*	The length range for the username is 8 to 30
	*	So you match the very first character using [a-zA-Z]. Hence you are left with the remaining 7 to 29 characters that are matched using [a-zA-Z0-9_]
	*	Note: {} are used to match multiple characters in regex. {n,} means at least n. {,n} means at most n, {n} means exactly n characters
	*	^ and $ are used to match the start and end of a string respectively
	*/