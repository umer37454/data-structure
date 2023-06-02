package Arrays_01;

public class _14_secondLargest {
    public static void main(String[] args){
        int[] arr = {55,62,35,44,74,25,54};
        int result = secondLargest(arr);
        System.out.println(result);
    }

    static int secondLargest(int[] arr){
        int max = arr[0];
        int secLargest = arr[0];
        int thirdLargest = arr[0];

        // just store the previous value of max in sec largest
        for (int j : arr) {
            if (j > max) { // 54 > 74
                thirdLargest = secLargest;
                secLargest = max;  // 62
                max = j; // 74
            }

        }

        System.out.println(thirdLargest);

        return secLargest;
    }
}
