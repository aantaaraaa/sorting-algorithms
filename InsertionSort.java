import java.util.*;

public class InsertionSort {

    public static void insertionSort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        insertionSort(arr, n);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

/**
 * Insertion Sort
 * Time Complexity:
 * - Worst Case: O(n^2) → array is reverse sorted, inner loop shifts all
 * previous elements
 * - Best Case: O(n) → array already sorted, inner loop does not shift
 * Space Complexity: O(1)
 * - Sorting is done in-place, only a temporary variable for key is used
 */