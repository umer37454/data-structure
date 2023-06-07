package Arrays_01;

public class _17_missingNum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 5, 6, 7, 8, 9};

        int result = missing(arr);
        System.out.println(result);
    }

    static int missing(int[] arr) {
        int arrSum = 0;
        int n = arr.length;

        for (int k : arr) {
            arrSum = arrSum + k;
        }

        int sum = n * (n + 1)/2;

        return sum - arrSum;
    }
}
