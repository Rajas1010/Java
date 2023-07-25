import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ex13_1 implements Runnable {

    String[] courses;

    public ex13_1(String[] numbers)
    {
        this.courses = numbers;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the amount of threads: ");
        final int qtyThreads = in.nextInt();

        int[] numbers = new int[qtyThreads];
        String[] courses = {"A", " B", " C", " D"};

        ExecutorService exs = Executors.newFixedThreadPool(qtyThreads);

        for(int i = 0; i<qtyThreads; i++)
        {
            exs.submit(new ex13_1(courses));
        }

        exs.shutdown();

        int sum = 0;


    }


    @Override
    public void run() {

        for(String str : courses)
        {
        System.out.println(str);
        }

}
}
