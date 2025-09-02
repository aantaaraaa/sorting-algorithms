import java.util.*;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (arr[j] > key && j >= 0) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}/*
  * Time Complexity:
  * - Worst Case: O(n^2) → array in descending order (maximum comparisons and
  * shifts)
  * - Average Case: O(n^2) → random order array
  * - Best Case: O(n) → array already sorted (only comparisons, no shifts)
  * Space Complexity: O(1) → in-place sorting, no extra memory used
  *
  */
