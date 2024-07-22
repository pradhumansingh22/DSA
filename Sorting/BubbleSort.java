package DSA.Sorting;

public class BubbleSort {
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            
            for (int j = 0; j < n - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {4, 1, 8, 2, 3, 5, 0};
        bubbleSort(arr);
    }
}
