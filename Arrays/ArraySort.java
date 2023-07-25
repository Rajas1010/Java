/**
 * bubble
 */
import java.util.*;

public class ArraySort
{
    public static void main(String[] args) 
    {
        int a[] = { 4, 5, 3, 6, 2, 5, 2, 8, 3, 9, 10 };

        System.out.println("BubbleSort:     "+Arrays.toString(bubbleSort(a)));
        System.out.println("SelectionSort:  "+Arrays.toString(selectionSort(a)));
        System.out.println("InsertionSort:  "+Arrays.toString(insertionSort(a)));
        System.out.println("MergeSort:      "+Arrays.toString(mergeSort(a,2,8)));
        System.out.println("QuickSort:      "+Arrays.toString(quickSort(a,2,8)));
        System.out.println("HeapSort:       "+Arrays.toString(heapSort(a)));

    }

    public static int[] bubbleSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    
    public static int[] selectionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    
    public static int[] insertionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    
    public static int[] mergeSort(int[] arr, int left, int right) 
    {
        if (left < right) 
        {
            int middle = (left + right) / 2;
            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }
        return arr;
    }
    private static void merge(int[] arr, int left, int middle, int right) 
    {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[middle + 1 + j];

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    
    public static int[] quickSort(int[] arr, int low, int high) 
    {
        if (low < high) 
        {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
        return arr;
    }
    private static int partition(int[] arr, int low, int high) 
    {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
    
    
    public static int[] heapSort(int[] arr) 
    {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i);

        // Extract elements from the heap one by one
        for (int i = n - 1; i >= 0; i--) 
        {
            // Move current root to the end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify the reduced heap
            heapify(arr, i, 0);
        }
        return arr;
    }

    private static void heapify(int[] arr, int n, int rootIndex) 
    {
        int largest = rootIndex; // Initialize the largest as root
        int leftChild = 2 * rootIndex + 1; // Left child index
        int rightChild = 2 * rootIndex + 2; // Right child index

        // If left child is larger than root
        if (leftChild < n && arr[leftChild] > arr[largest]) 
            largest = leftChild;

        // If right child is larger than the largest so far
        if (rightChild < n && arr[rightChild] > arr[largest]) 
            largest = rightChild;

        // If the largest is not the root
        if (largest != rootIndex) 
        {
            int swap = arr[rootIndex];
            arr[rootIndex] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }
    
    
}