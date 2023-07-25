import java.util.*;
import india.*;
public class Ex2_3{
        public static void main(String args[]){
        String pname;
        String pos;
        String nname;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Player Name:");
        pname=obj.next();
        System.out.println("Enter his Position:");
        pos=obj.next();
        System.out.println("Enter Nick name:");
        nname=obj.next();
        team a=new team();
        a.display(pname,pos,nname);

                }
        }