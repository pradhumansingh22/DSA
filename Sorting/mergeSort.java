package DSA.Sorting;

public class mergeSort {

    static void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int idx = 0;
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                temp[idx++] = arr[left];
                left++;
            } else {
                temp[idx++] = arr[right];
                right++;
            }
        }
        
        while (left <= mid) {
            temp[idx++] = arr[left];
            left++;
        }
        while (right <= high) {
            temp[idx++] = arr[right];
            right++;
        }

        for (int i = low; i <= high; i++) { // explain the working of this loop with example
                                            // why are we using i - low index
            arr[i] = temp[i - low];
        }
    }
    
    static void mSort(int[] arr, int low, int high) {

        if (low == high) {
            return;
        } 
        else {
            int mid = (low + high) / 2;
            mSort(arr, low, mid);
            mSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 5, 3, 7, 9, 8 };
        mSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
