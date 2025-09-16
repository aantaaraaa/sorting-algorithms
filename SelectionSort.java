import java.util.*;

public class SelectionSort {

    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }

            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Array after sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:  ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr, n);
    }
}

/**
 * Selection Sort (Iterative)
 * Time Complexity: O(n^2)
 * - Outer loop runs (n-1) times
 * - Inner loop scans the remaining array each time
 * - Total comparisons ~ n*(n-1)/2
 * Space Complexity: O(1)
 * - Sorting is done in-place
 * - Only a constant temp variable is used
 */