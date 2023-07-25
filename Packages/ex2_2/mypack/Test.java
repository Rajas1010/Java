package mypack;
import java.util.*;
class Student{
        int rno;
        Scanner obj=new Scanner(System.in);
        public int getNumber()
		{
            System.out.println("Enter the rollnumber:");
            rno=obj.nextInt();
            return rno;
        }
        public void putNumber()
		{
             System.out.println("The Roll Number is "+rno);
        }
}
public class Test extends Student{
        int mark;
        public int getMarks()
		{
            System.out.println("Enter mark:");
            mark=obj.nextInt();
            return mark;
        }
        public void putMarks(int a[])
		{
                for(int i=0;i<5;i++)
				{
                     System.out.println("Mark is:"+a[i]);
                }
        }
}