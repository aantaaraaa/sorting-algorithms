import java.util.*;

public class RecursiveInsertionSort {

    public static void recursiveInsertionSort(int[] arr, int n) {
        if (n <= 1)
            return;

        recursiveInsertionSort(arr, n - 1);

        int key = arr[n - 1];
        int j = n-2;

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = key;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        recursiveInsertionSort(arr, n);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

/**
 * Recursive Insertion Sort
 * Time Complexity:
 * - Worst Case: O(n^2) → reverse sorted array
 * - Best Case: O(n) → already sorted array
 * Space Complexity:
 * - O(n) → recursion depth is n
 */