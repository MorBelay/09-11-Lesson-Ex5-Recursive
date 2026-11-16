
// מגישים: בלייב מור וחיים אשרף 50/5

public class Ex5 {

    // Print numbers that have a negative number before them
    // and a positive number after them
    public static void printNumbers(int[] arr, int size) {

        // Check if the array and size are valid
        if (arr == null || size < 0 || size > arr.length) {
            return;
        }

        // Stop when there are less than three elements
        if (size < 3) {
            return;
        }

        // Check the number and its two neighbors
        if (arr[size - 3] < 0 && arr[size - 1] > 0) {
            System.out.println(arr[size - 2]);
        }

        printNumbers(arr, size - 1);
    }

    public static void main(String[] args) {
        int[] arr = {-5, 3, -2, 8, 4, -7, 6};

        printNumbers(arr, arr.length);
    }
}

// סיבוכיות: O(n)