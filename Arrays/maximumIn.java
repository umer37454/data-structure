package Arrays;

public class maximumIn {
    public static void main(String[] args) {
        int[] arr = {45,12,47,58,56,23,68,414,25,74,68,41,35,97};

        int biggestElement = max(arr);
        System.out.println(biggestElement);
    }

    public static int max(int[] arr){
        int max = arr[0];

        for (int j : arr) {
            if (max <= j) {
                max = j;
            }
        }

        return max;
    }
}
