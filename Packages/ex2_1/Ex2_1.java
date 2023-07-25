import test.*;
import java.util.*;
public class Ex2_1{
        public static void main(String args[]){
                Scanner obj=new Scanner(System.in);
                System.out.println("Enter 2 no.s:");
                int a=obj.nextInt();
                int b=obj.nextInt();
                Sam obj1=new Sam();
                obj1.fun(a,b);
        }
}