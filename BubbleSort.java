import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
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

        bubbleSort(arr); // Call bubble sort function

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Time Complexity: 
 *   - Worst Case: O(n^2) → array in descending order (maximum swaps)
 *   - Average Case: O(n^2) → random order array
 *   - Best Case: O(n) → array already sorted (if we use a swapped flag optimization)
 * Space Complexity: O(1) → sorting is done in-place without extra memory
 *
 */
