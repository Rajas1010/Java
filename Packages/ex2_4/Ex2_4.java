import java.util.*;
import passwordCheck.*;
public class Ex2_4{
        public static void main(String args[]){
                Password a=new Password();
                Scanner obj=new Scanner(System.in);
                System.out.println("Create the password:");
                String b=obj.next();
                int p=a.validp(b);
                if(p==3)
                        System.out.println("The entered password is valid");
                else
                        System.out.println("The enterd password is not valid");
        }
}