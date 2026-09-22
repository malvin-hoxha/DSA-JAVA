class LinearSearch {

    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public void print(int[] arr, int result) {
        if (result != -1) {
            System.out.println(arr[result] + " is found at index " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}

class BinarySearch {

    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int m = (start + end) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                start = m + 1;
            } else {
                end = m - 1;
            }
        }

        return -1;
    }

    public void print(int[] arr, int result) {
        if (result != -1) {
            System.out.println(arr[result] + " is found at index " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}

public class Algorithms {

    public static void main(String[] args) {

        BinarySearch bSearch = new BinarySearch();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int result = bSearch.search(arr, 7);
        bSearch.print(arr, result);

    }
}
