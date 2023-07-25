import java.util.*;
import java.util.stream.*;
import java.util.regex.Pattern;
import java.nio.charset.*;
public class StringInbuilt
{
	public static void main(String args[])throws Exception
	{
	
	/*
		//1 length():
		String str = "Hello, World!";
		int len = str.length(); // len will be 13
		System.out.println(len);	 
		
		//2  charAt()
		String str = "Hello, World!";
		char ch = str.charAt(1); // ch will be 'e'
		
		//3  substring()
		String s = "Hello, World!";
		System.out.println(s.substring(7,9));//wo
		
		//4 Occurence
			String s="Rajasekar";
			int w=(int)(s.chars().filter(ch -> ch == 'a').count());
			System.out.println(w);
			*/
		//4 reverse
			String s="Rajasekar";
			System.out.println(new StringBuilder(s).reverse());
		/*
		//4 subSequence() 
		//method in Java is a method of the java.lang.String class. 
		//This method is used to extract a portion of a string as a new character sequence, without modifying the original string.
		
		String str = "abc";
		CharSequence subStr = str.subSequence(1,2);
		System.out.println(subStr);
	
		//5  indexOf()
		String str = "Hello, World!";
		int index = str.indexOf("o"); // index will be 4
		
		//6  lastIndexOf()
		String str = "Hello, World!";
		int lastIndex = str.lastIndexOf("o"); // lastIndex will be 8
		
		//7  toUpperCase()
		String str = "Hello, World!";
		String upper = str.toUpperCase(); // upper will be "HELLO, WORLD!"
		
		//8  toLowerCase()
		String str = "Hello, World!";
		String lower = str.toLowerCase(); // lower will be "hello, world!"
		
		//9 trim()
		String str = "   Hello, World!   ";
		String trimmed = str.trim(); // trimmed will be "Hello, World!"
		
		//10  replace()
		String str = "Hello, World!";
		String replaced = str.replace("o", "a"); // replaced will be "Hella, Warld!"
		System.out.println(replaced);
		
		//11 replaceFirst()
		String str = "Hello, world!";
		String newStr = str.replaceFirst("o", "a");
		System.out.println(newStr);//
		
		//12 replaceAll()
		String s = "An Apple a day keeps the doctor away. I love Apples.";
		String n = s.replaceAll("(?i)apple", "orange");
		System.out.println(n); // Output: "An orange a day keeps the doctor away. I love oranges."

		//12 startsWith()
		String str = "Hello, World!";
		boolean startsWith = str.startsWith("Hello"); // startsWith will be true
		
		//13 endsWith()
		String str = "Hello, World!";
		boolean endsWith = str.endsWith("World!"); // endsWith will be true
		
		//14 concat()
		String str1 = "Hello";
		String str2 = "World";
		String concatenated = str1.concat(str2); // concatenated will be "HelloWorld"
		System.out.println(concatenated);
		
		
		//15 isEmpty()
		String str1 = "";
		String str2 = "Hello";
		String str3 = " ";
		boolean isEmpty1 = str1.isEmpty(); // isEmpty1 will be true
		boolean isEmpty2 = str2.isEmpty(); // isEmpty2 will be false
		System.out.println(str3.isEmpty());//want true use isBlank
		
		//15 split()
		String str = "apple,banana,orange";
		String[] arr = str.split(","); // arr will be {"apple", "banana", "orange"}
		
		//16 equals()
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "Hello";
		System.out.println(str1.equals(str2)) ; // false
		System.out.println(str1.equals(str3)); // true
		
		//17 equalsIgnoreCase()
		String str1 = "hello";
		String str2 = "Hello";
		boolean isEqual = str1.equalsIgnoreCase(str2); // isEqual will be true
		
		//18 valueOf()
		int num = 123;
		String str = String.valueOf(num); // str will be "123"
		
		//19 format(): This method formats a string using a specified format string and arguments.
		String name = "John";
		int age = 25;
		String message = String.format("My name is %s and I am %d years old.", name, age);
		System.out.println(message); // message will be "My name is John and I am 25 years old."
		
		//20 matches() This method returns true if the string matches a specified regular expression.
		String str = "9845785345";
			boolean matches = str.matches("98[0-9]{8}"); // matches will be true
		System.out.println(matches);
		
		//21 getBytes() This method returns a byte array of the characters in the string.
		String str = "Hello, World!";
		byte[] bytes = str.getBytes(); // bytes will be [72, 101, 108, 108, 111, 44, 32, 87, 111, 114, 108, 100, 33]
		
		//22 codePointAt() This method returns the Unicode code point of the character at the specified index
		String str = "Hello, World!";
		int codePoint = str.codePointAt(1); // codePoint will be 101 (the Unicode code point for 'e')
		
		//23  toCharArray() This method returns a char array of the characters in the string.
		String str = "Hello, World!";
		char[] chars = str.toCharArray(); // chars will be ['H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!']
		
		//24 copyValueOf() method in Java is a static method of the java.lang.String class. This method is used to create a new string containing the characters of an array of characters.
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String str = String.copyValueOf(chars);
		System.out.println(str);
		
		//25 compareTo() and compareToIgnoreCase(): These methods compare two strings lexicographically.
		String str1 = "apple";
		String str2 = "banana";
		int compare1 = str1.compareTo(str2); // compare1 will be negative (-1)
		int compare2 = str1.compareToIgnoreCase("Apple"); // compare2 will be 0
		
		//27 contains() method to check if a string contains a substring
		String str1 = "Hello, World!";
		String str2 = "Hello";
		String str3 = "world";
		boolean contains1 = str1.contains(str2); // contains1 will be true
		boolean contains2 = str1.contains(str3); // contains2 will be false
		boolean contains3 = str1.toLowerCase().contains(str3); // contains3 will be true
		
		//28 compareTo() method to compare two strings lexicographically
		String str1 = "apple";
		String str2 = "banana";
		String str3 = "Apple";
		int compare1 = str1.compareTo(str2); // compare1 will be negative (-1)
		int compare2 = str1.compareTo(str3); // compare2 will be positive (32)
		int compare3 = str1.compareToIgnoreCase(str3); // compare3 will be 0
		
		//29  join() method to concatenate an array of strings into a single string with a specified delimiter:
		String[] words = {"a", "bc"};
		String[] words2 = {"ab", "c"};
		String delimiter = "";
		String joinedString = String.join(delimiter, words);
		String joinedString2 = String.join(delimiter, words2);
		System.out.println(joinedString.equals(joinedString2));
		
		System.out.println(joinedString);
		System.out.println(joinedString2);
		
		//30  strip() method to remove leading and trailing white space from a string:
		String str1 = "   Hello, World!   ";
		String str2 = "   \n\t  ";
		
		String stripped1 = str1.strip();
		String stripped2 = str2.strip();
		
		System.out.println(stripped1); // Output: "Hello, World!"
		System.out.println(stripped2);
		System.out.println(stripped2.isEmpty()); // Output: true
		
		//31 stripLeading() method to remove leading white space from a string:
		String str1 = "   Hello, World!   ";
		String str2 = "   \n\t  ";
		
		String stripped1 = str1.stripLeading();
		String stripped2 = str2.stripLeading();
		
		System.out.println(stripped1); // Output: "Hello, World!   "
		System.out.println(stripped2);
		System.out.println(stripped2.isEmpty()); // Output: true
		
		//32  stripTrailing() method to remove trailing white space from a string:
		String str1 = "   Hello, World!   ";
		String str2 = "   \n\t  ";
		
		String stripped1 = str1.stripTrailing();
		String stripped2 = str2.stripTrailing();
		
		System.out.println(stripped1); // Output: "   Hello, World!"
		System.out.println(stripped2.isEmpty()); // Output: true
		
		//33 lines() 
		String str = "The quick brown fox\nJumps over the lazy dog";
		
		String[] lines = str.lines().toArray(String[]::new);
		
		for (String line : lines) 
			System.out.println(line);
		
		//34 The repeat() method in Java is used to create a new string by repeating the original string a certain number of times. It was introduced in Java 11.
		String str = "Hello, World! ";
		
		String repeated = str.repeat(3);
		
		System.out.println(repeated);
	
		//35 codePointBefore() method in Java is used to get the Unicode code point of the character immediately preceding a specific index in a string
		String str = "eaa";
		
		int codePoint = str.codePointBefore(1);
		
		System.out.println("The code point before index 1 is: " + codePoint);//ascii of e is 101
	
		//36 codePointCount() method in Java is used to get the number of Unicode code points in 
		//a substring of a given string. It takes two integer arguments: beginIndex, which is the index of 
		//the first character in the substring, and endIndex, which is the index of the character following 
		//the last character in the substring.
		String str = "Hello, World!";
		
		int codePointCount = str.codePointCount(2, 7);
		
		System.out.println("The number of code points in the first 5 characters is: " + codePointCount);
		System.out.println(str);
		
		
		//37 offsetByCodePoints() method in Java is used to get the index of the character that is codePointOffset code points away from a specified index in a string. It takes two integer arguments: index, which is the starting index, and codePointOffset
		String str = "Hello, World!";
		int index = 5;
		int codePointOffset = 2;
		int new_index = str.offsetByCodePoints(index, codePointOffset);
		System.out.println("The index of the character " + codePointOffset + " code points after index " + index + " is: " + new_index);
		System.out.println(str);
		
		//38  getChars() method is used to copy a specified range of characters from a string into a destination character array. It takes four arguments: srcBegin, which is the starting index of the substring to be copied, srcEnd, which is the index of the character following the last character in the substring to be copied, dst, which is the destination character array, and dstBegin, which is the starting index of the destination array where the copied characters will be stored.
		String str = "Hello, World!";
		char[] charArray = new char[7];
		
		str.getChars(0, 5, charArray, 2);
		charArray[0]='7';
		System.out.println(Arrays.toString(charArray)+"\n"+ new String(charArray));
		
		
		//39  valueOf() method in Java is a static method that is used to convert a string to an object of a specified class. The class must have a constructor that takes a string as its argument, and the string must be in a format that can be parsed by the constructor. The valueOf() method is available for many classes in Java, including primitive wrapper classes (such as Integer, Double, Boolean, etc.) and some other classes (such as BigInteger, BigDecimal, Enum, etc.).
		// Convert a string to an Integer object
		String str1 = "123";
		Integer intObj = Integer.valueOf(str1);
		System.out.println("The value of intObj is: " + intObj);
		
		// Convert a string to a Double object
		String str2 = "3.14";
		Double doubleObj = Double.valueOf(str2);
		System.out.println("The value of doubleObj is: " + doubleObj);
		
		// Convert a string to a Boolean object
		String str3 = "true";
		Boolean boolObj = Boolean.valueOf(str3);
		System.out.println("The value of boolObj is: " + boolObj);
		
		// Convert a string to an Enum object
		enum CardSuit{
			"SPADES",
			"SPADES3"
		}
		String str4 = "SPADES";
		CardSuit suitObj = CardSuit.valueOf(str4);
		System.out.println("The value of suitObj is: " + suitObj);
			
		//40  hashCode(), which is a method in Java that is used to generate a hash code for an object. The hash code is an integer value that is typically used to quickly identify an object in a hash table or other data structure.
		String str = "Hello, world!";
		int hashCode = str.hashCode();
		System.out.println("The hash code of the string is: " + hashCode);
		
			
		//41 isBlank() method in Java is used to determine if a string is empty or consists of only whitespace characters. It was introduced in Java 11.
		String str1 = "";
		String str2 = "   ";
		String str3 = "Hello, World!";
		
		System.out.println(str1.isBlank()); // Output: true
		System.out.println(str2.isBlank()); // Output: true , check space also use isEmpty
		System.out.println(str3.isBlank()); // Output: false
		
		//42  getClass() method in Java is a method that is used to get 
		//the runtime class of an object. It returns an instance of the Class class, 
		//which represents the class of the object. The Class class provides methods 
		//that can be used to get information about the class, such as its name,
		// superclass, implemented interfaces, constructors, methods, fields, annotations, etc.
		Character str = 'l';
		Class<? extends Character> clazz = str.getClass();
		System.out.println("The class of the string is: " + clazz.getName());
		
		//43 contentEquals() method in Java is a method that is used to compare the contents of a String object with the contents of another CharSequence object (such as another String, a StringBuilder, a StringBuffer, etc.). It returns a boolean value that indicates whether the two objects have the same characters in the same order.
		String str1 = "Hello, world!";
		String str2 = "Hello, Java!";
		StringBuilder sb = new StringBuilder("Hello, world!");
		
		boolean isEqual1 = str1.contentEquals(str2);   // false
		boolean isEqual2 = str1.contentEquals(sb);     // true
		
		System.out.println("Are str1 and str2 equal? " + isEqual1);
		System.out.println("Are str1 and sb equal? " + isEqual2);
		
		//44 codePoints() method in Java is used to return an IntStream of Unicode code points from the given String.
		String str =  "Hello, world!";
		IntStream codePoints = str.codePoints();
		
		codePoints.forEach(System.out::println);
		
		//45 stripIndent() method in Java is used to remove leading whitespace from each line of a String that is preceded by the same amount of whitespace on the first line. This method is commonly used in multi-line strings to align the text to a certain margin while preserving the readability of the code.
		
		String str = "    Hello,  \n    world!";
		String stripped = str.stripIndent();
		
		System.out.println(stripped);
		
		//46 formatted() method in Java is used to format a String by replacing each occurrence of a format specifier in the String with the corresponding argument(s) passed to the method. The format specifier is denoted by a % character, followed by a format specifier letter and optional format modifiers.
		
		String name = "John";
		int age = 30;
		double height = 1.8;
		
		String formattedString = "My name is %s, I am %d years old and %.2f meters tall.";
		String result = String.format(formattedString, name, age, height);
		
		System.out.println(result);
		
		//47 intern() method in Java is a method of the java.lang.String class. It is used to obtain a canonical representation of the string. In other words, it returns a reference to the interned string, which is stored in a pool of strings maintained by the Java Virtual Machine (JVM). If a string with the same contents already exists in the pool, then a reference to that string is returned instead.
		
		String str1 = "hello";
		String str2 = new String("hello");
		
		System.out.println("str1 == str2: " + (str1 == str2));
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1 == str2.intern(): " + (str1 == str2.intern()));
		
		//48 digit only
		String s="hello89";
		System.out.println(s.replaceAll("\\D+",""));
		
		
		//49 letterOnly
		String s="hello";
		System.out.println(s.replaceAll("[^a-zA-Z]+", ""));
		
		
		//50 all alpbabet 
	
    String str1 = "avjfbabdfbakldsfkdsnfknfhjq ";
    String str2 = "abcdefghijklmnopqrstuvwxyz";

    System.out.println(str1.toLowerCase().matches(".*[a-z].*") && str1.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26); // Output: true
    System.out.println(str2.toLowerCase().matches(".*[a-z].*") && str2.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26); // Output: true

//51
		String s="helloWorld";
		char[] a=s.toCharArray();
		System.out.println(Arrays.toString(a));



//_____________________________________________________________________________________________
/*		
		//String(byte[] byte_arr) 
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s_byte =new String(b_arr);
		

		//String(byte[] byte_arr, Charset char_set)
		byte[] b_arr = {71, 101, 101, 107, 115};
		Charset cs = Charset.defaultCharset();
		String s_byte_char = new String(b_arr, cs);
		System.out.println(s_byte_char);

		//String(byte[] byte_arr, String char_set_name)
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s = new String(b_arr, "US-ASCII");
		System.out.println(s);
	
		//String(byte[] byte_arr, int start_index, int length) 
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s = new String(b_arr, 1, 3);
		System.out.println(s);
			
		//String(byte[] byte_arr, int start_index, int length, Charset char_set) 
		byte[] b_arr = {71, 101, 101, 107, 115};
		Charset cs = Charset.defaultCharset();
		String s = new String(b_arr, 1, 3, cs);
		System.out.println(s);
		
		//String(byte[] byte_arr, int start_index, int length, String char_set_name) 
		byte[] b_arr = {71, 101, 101, 107, 115};
		String s = new String(b_arr, 1, 4, "US-ASCII");
		System.out.println(s);
		
		//String(char[] char_arr)
		char char_arr[] = {'G', 'e', 'e', 'k', 's'};
		String s = new String(char_arr);
		System.out.println(s);
		
		//String(char[] char_array, int start_index, int count)
		char char_arr[] = {'G', 'e', 'e', 'k', 's'};
		String s = new String(char_arr , 1, 3);

		//String(int[] uni_code_points, int offset, int count) 
		int[] uni_code = {71, 101, 101, 107, 115};
		String s = new String(uni_code, 1, 3);
		System.out.println(s);

		//String(StringBuffer s_buffer) 
		StringBuffer s_buffer = new StringBuffer("Geeks");
		String s = new String(s_buffer);
		
		//String(StringBuilder s_builder)
		StringBuilder s_builder = new StringBuilder("Geeks");
		String s = new String(s_builder); 
	*/
	}
}