import java.util.*;

public class BubbleSort {

    public static void bubbleSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
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

        bubbleSort(arr, n);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
/**
 * Bubble Sort
 * Time Complexity:
 * - Worst Case: O(n^2) → array is reverse sorted, every comparison leads to a
 * swap
 * - Best Case: O(n) → array already sorted (can optimize with a flag)
 * Space Complexity: O(1)
 * - Sorting is done in-place, only uses a temporary variable for swapping
 */