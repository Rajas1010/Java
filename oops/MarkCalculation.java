import java.io.*;
import java.util.*;
class reg
{
        public int regno;
        public String name;
        public String branch;
        public Scanner s=new Scanner(System.in);
        public void getr()
        {
                System.out.println("Enter the registration number");
                regno=s.nextInt();
                System.out.println("Enter the name");
                name=s.next();
        }
}
class cse extends reg
{
        public int cn;
        public int ds;
        public int t;
        Scanner s1=new Scanner(System.in);
        public void getc()
        {
                getr();
                System.out.println("Enter the marks of the computer network");
                cn=s1.nextInt();
                System.out.println("Enter the marks of the data structures");
                ds=s1.nextInt();
                System.out.println("Enter the marks of the testing");
                t=s1.nextInt();
        }
        public void dispc()
        {
                int avgc=(cn+ds+t)/3;
                System.out.println("The registration number is "+regno);
                System.out.println("The name of the student is "+name);
                System.out.println("The branch is "+branch);
                System.out.println("The marks of the electronic circuits is "+cn);
                System.out.println("The marks of the circuit analysis is "+ds);
                System.out.println("The marks of the analog communication is"+t);
                System.out.println("The average of the 3 marks is "+avgc);
        }
		}
class ece extends reg
{
        public int ec;
        public int ca;
        public int ac;
        Scanner s2=new Scanner(System.in);
        public void gete()
        {
                getr();
                System.out.println("Enter the marks of the electronic circuits");
                ec=s2.nextInt();
                System.out.println("Enter the marks of the circuit analysis");
                ca=s2.nextInt();
                System.out.println("Enter the marks of the analog communication");
                ac=s2.nextInt();
        }
        public void dispe()
        {
                int avge=(ec+ca+ac)/3;
                System.out.println("The registration number is "+regno);
                System.out.println("The name of the student is "+name);
                System.out.println("The branch is "+branch);
                System.out.println("The marks of the electronic circuits is "+ec);
                System.out.println("The marks of the circuit analysis is "+ca);
                System.out.println("The marks of the analog communication is"+ac);
                System.out.println("The average of the 3 marks is "+avge);
        }
}

public class MarkCalculation
{
        public static void main(String args[])
        {
                cse cr=new cse();
                ece eg=new ece();
                Scanner sd=new Scanner(System.in);
                int ch;
                System.out.println("Enter the choice");
                System.out.println("1.CSE");
                System.out.println("2.ECE");
                ch=sd.nextInt();
                switch(ch)
				 {
                        case 1:
                        cr.getc();
                        cr.dispc();
                        break;
                        case 2:
                        eg.gete();
                        eg.dispe();
                        break;
                }
        }
}