public class NextMinimum 
{
    public static int findNextMinimum(int[] arr, int currentMinimum) 
    {
        int nextMinimum = Integer.MAX_VALUE;
        int prevIndex = -1;

        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == currentMinimum) 
            {
                if (prevIndex != -1)
                    arr[prevIndex] = Integer.MAX_VALUE;
                prevIndex = i;
            } 
            else if (arr[i] > currentMinimum && arr[i] < nextMinimum)
            {
                nextMinimum = arr[i];
            }
        }
                
        return nextMinimum;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 2, 1, 4, 3, 4 };
        int currentMinimum = 2;

        int nextMinimum = findNextMinimum(arr, currentMinimum);

        System.out.println("Next minimum value after " + currentMinimum + " is: " + nextMinimum);
    }
}
