import java.util.*;

public class RecursiveBubble {

    public static void recursiveBubble(int[] arr, int n) {

        if (n == 1)
            return;

        for (int j = 0; j < n - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        recursiveBubble(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        recursiveBubble(arr, n);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

/**
 * Bubble Sort (Recursive)
 * Time Complexity:
 * - Worst Case: O(n^2) → array is reverse sorted, every comparison leads to a
 * swap
 * - Best Case: O(n) → array already sorted (can be optimized with a flag)
 * Space Complexity: O(n)
 * - Recursion depth goes up to n
 */