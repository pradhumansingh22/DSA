package DSA.Sorting;

public class quickSort {
    
    public static void qSort(int[] arr, int low, int high) {

        if (low > high)
            return;
            else {
            int pivotIndex = findPivot(arr, low, high);
            qSort(arr, low, pivotIndex - 1);
            qSort(arr, pivotIndex + 1, high);
        }
    }
    
    public static int findPivot(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j > low) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    

    public static void main(String[] args) {
        int[] arr = { 4, 6, 2, 5, 7, 9, 1, 3 };
        qSort(arr, 0, arr.length - 1);
        
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }
}
