import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class Hashsets {
    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet<>();

       
        evenNumber.add(26);
        evenNumber.add(2);
        evenNumber.add(38);
        evenNumber.add(4);
        System.out.println("HashSet: " + evenNumber);
        HashSet<Integer> oddNumber = new HashSet<>();

        oddNumber.add(21);
        oddNumber.add(38);
        oddNumber.add(7);
        oddNumber.retainAll(evenNumber);
       
        System.out.println("the common in both the hashset is:"+oddNumber);
       
        Iterator value = evenNumber.iterator();
        Object[] array = evenNumber.toArray();
        for(Object obj : array){
            System.out.println("the array elements are"+ obj);

        }
        System.out.println("The iterator values are: ");
        while (value.hasNext()) {
            System.out.println(value.next());

        }
               boolean value2 = evenNumber.removeAll(evenNumber);
        System.out.println("Are all elements removed in evenNumbers HashSet : " + value2);
    }
}

