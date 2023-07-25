import java.util.Arrays;
public class SortStringArrayCaseInSensitive
{
   public static void main(String[] args) 
   {
      String str="HoLlYWoOd";
	  String a[]=str.split("");
      Arrays.sort(a, String.CASE_INSENSITIVE_ORDER);
      Arrays.stream(a).forEach(System.out::print); 
   }
}