package DSA.SearchingAlgorithms;


public class BinarySearch {
    public static int bSearch(int[] arr, int n, int key) {

        int start = 0;
        int end = n - 1;

        int mid = start + (end - start) / 2;

        while (start <= end) {

            if (arr[mid] == key) {
                return mid;
            }

            else if (arr[mid] < key) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }

            mid = start + (end - start) / 2;

        }

        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 6, 8, 12, 25 };
        System.out.println(bSearch(arr, arr.length, 12));
    }
}
