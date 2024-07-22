package DSA.Sorting;

public class insertionSort {
    
    public static void InsertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 3, 6, 9, 1, 4, 2 };
        InsertionSort(arr, arr.length);
    }
}
