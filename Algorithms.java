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

class BinarySearchRecursive {

    public int search(int[] arr, int target, int start, int end) {

        if (start <= end) {
            int m = (start + end) / 2;

            if (arr[m] == target) {
                return m;
            } else if (arr[m] < target) {
                return search(arr, target, m + 1, end);
            } else {
                return search(arr, target, start, m - 1);
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

class BubbleSort {

    public void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }

            if (!swap) {
                break;
            }
        }
    }
}

class SelectionSort {

    public void sort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

public class Algorithms {

    public static void main(String[] args) {

        int[] arr = { 5, 1, 10, 90, 18, 2, 7 };

        for (int i : arr) {
            System.out.println(i + " ");
        }

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }
}
