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

class InsertionSort {
    public void sort(int arr[]) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // 2

            int j = i - 1; // 0

            while (j >= 0 && arr[j] > key) { // 5 > 2
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j] = key;
        }
    }
}

class QuickSort {

    public void sort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }

        int partitionIndex = partition(arr, low, high);
        sort(arr, low, partitionIndex - 1);
        sort(arr, partitionIndex + 1, high);
    }

    public int partition(int arr[], int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        arr[high] = arr[i + 1];
        arr[i + 1] = pivot;
        return i + 1;
    }
}

class MergeSort {

    public void sort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < temp.length; l++) {
            arr[low + l] = temp[l];
        }
    }
}

public class Algorithms {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 4, 1 };

        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();

        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");

        }

    }
}
