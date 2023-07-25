import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

class ex10_3{
    public static void main(String[] args){

        LinkedList<Object> students = new LinkedList<>();


        students.add("JaisanPaul");
        students.add("Satheesh");
        students.add("KiranSarath");
        students.add("Gautam karthik");
        System.out.println("LinkedList: " + students);

        ListIterator list_Iter = students.listIterator();


        System.out.println("The iteration of list is as follows:");
        while(list_Iter.hasNext()){
            System.out.println(list_Iter.next());
        }
        System.out.println("the linked list in reverse order \n");
        Iterator<Object> iterator = students.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        System.out.println("the first element in the linked list is : "+students.getFirst());
        System.out.println("the last element in the linked list is : "+students.getLast());

        Object[] array = students.toArray();
        arrayShuffle(array);
        listDataAdder(array, students);
        System.out.println("The list after shuffle 1 : " +students.toString());
        System.out.println();
    }
    public static void listDataAdder(Object[] arr,
                              LinkedList<Object> list)
    {

        ListIterator<Object> it = list.listIterator();

        for (Object e : arr) {
            it.next();
            it.set(e);
        }
    }
    public static void arrayShuffle(Object[] arr)
    {
        Random rand = new Random();
        for (int i = 0; i < arr.length - 1; i++) {
            int index = rand.nextInt(i + 1);
            Object g = arr[index];
            arr[index] = arr[i];
            arr[i] = g;
        }
    }
}