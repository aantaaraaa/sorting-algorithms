
import java.util.*;

public class RecursiveSelectionSort {

    public static void selectionSort(int[] arr, int start, int n) {

        if(start >= n-1) return;

        int mini = start;
        for (int j = start + 1; j < n; j++) {
            if (arr[j] < arr[mini]) {
                mini = j;
            }
        }

        int temp = arr[mini];
        arr[mini] = arr[start];
        arr[start] = temp;

        selectionSort(arr, start + 1, n);
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

        selectionSort(arr, 0, n);

        System.out.println("Array after Recursive Selection Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}