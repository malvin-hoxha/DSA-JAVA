class LinearSearch {

    public int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

public class Algorithms {

    public static void main(String[] args) {

        int[] arr = { 5, 6, 90, 85, 15 };
        LinearSearch ls = new LinearSearch();
        int result = ls.search(arr, 85);

        if (result != -1) {
            System.out.println(arr[result] + " is found at index " + result);
        } else {
            System.out.println("Target not found");
        }
    }
}
