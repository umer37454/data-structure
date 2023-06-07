package Arrays_01;

public class _18_checkSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 8, 8}; // sorted array

        String result = check(arr);
        System.out.println(result);
    }

    static String check(int[] arr) {
        if (arr[0] < arr[1]) {
            return "Ascending";
        }

        return "Descending";
    }
}