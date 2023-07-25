import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ex10_1{
    public static void main(String[] args){

        ArrayList<String> colors = new ArrayList<>();

        colors.add("black");
        colors.add("yellow");
        colors.add("green");
        colors.add("white");
        colors.add("blue");
        System.out.println("ArrayList1: " + colors);
        ArrayList<String> colors2 = new ArrayList<>();

        colors2.add("grey");
        colors2.add("pink");
        colors2.add("green");
        colors2.add("white");
        System.out.println("ArrayList2: " + colors2);
        colors2.addAll(colors);
        System.out.println("joinig two arraylist :"+colors2);

        Iterator<String> iter= colors.iterator();
        System.out.println("the colors are iterated\n");
        while (iter.hasNext()) {
            System.out.print(iter.next() + "\n ");

        }
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the index of the element to retrieve :");
        int index =sc.nextInt();
        String value = colors.get(index);
        System.out.println("the element is at index is :"+ value);

    }
}