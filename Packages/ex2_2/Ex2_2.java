import mypack.*;
import mypack1.*;
import java.util.*;
public class Ex2_2{
        public static void main(String args[]){
                Scanner obj=new Scanner(System.in);
                Test s=new Test();
                int a=s.getNumber();
                s.putNumber();
                int []ma=new int[5];
                for(int i=0;i<5;i++){
                        ma[i]=s.getMarks();
                }
                s.putMarks(ma);
                Sports sp=new Sports();
                String will=sp.getSportwt();
                int tot=0;
                for(int i=0;i<5;i++)
                        tot+=ma[i];
                sp.display(will,tot);
        }
}