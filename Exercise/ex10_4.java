import java.util.Iterator;
import java.util.TreeSet;
public  class ex10_4{
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();

        colors.add("black");
        colors.add("yellow");
        colors.add("green");
        colors.add("white");
        colors.add("blue");
        System.out.println("TreeSet: " + colors);
        TreeSet<String> color2 = new TreeSet<>();
        color2.add("grey");
        color2.addAll(colors);
        System.out.println("New TreeSet: " + color2);
        Iterator value = colors.iterator();
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }
        String first = color2.first();
        System.out.println("First Number: " + first);
        color2.remove(first);
        for(Object e:color2) {
            System.out.println("the elements present after deletion is :"+e);
        }    }


}