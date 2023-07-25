package mypack1;
import java.util.*;
public class Sports{
        Scanner obj=new Scanner(System.in);
        int tot;
        public String getSportwt(){
                System.out.println("Whether you are intrested in Sports(yes/no)?");
                String a=obj.next();
                return a;
        }
        public void display(String a,int total){
                System.out.println("The student is intrested in Sports-"+a+"\nThe total is "+total);
        }
}
