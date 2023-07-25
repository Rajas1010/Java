package test;
import math.*;
import java.util.*;
public class Sam{
        Scanner obj=new Scanner(System.in);
        Calculation arith=new Calculation();
        public void fun(int a,int b){
                System.out.println("1.Add\t2.Sub\t3.Mul\t4.Div\nEnter your choice:");
                int choice=obj.nextInt();
                switch(choice){
                        case 1:{
                                System.out.println("The sum of 2 number is:"+arith.add(a,b));
                                break;
                        }
                        case 2:{
                                System.out.println("The sub of 2 number is:"+arith.sub(a,b));
                                break;
                        }
                        case 3:{
                                System.out.println("The mul of 2 number is:"+arith.mul(a,b));
                                break;
                        }
                        case 4:{
                                System.out.println("The div of 2 number is:"+arith.div(a,b));
                                break;
                        }
                }
        }
}
