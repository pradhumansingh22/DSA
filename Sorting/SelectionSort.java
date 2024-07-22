package DSA.Sorting;

public class SelectionSort {
    public static void selectionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        for (int element : arr) {
            System.out.print(element);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 6, 1 };
        selectionSort(arr, arr.length);
    }
}
