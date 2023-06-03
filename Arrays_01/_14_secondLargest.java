package Arrays_01;

public class _14_secondLargest {
    public static void main(String[] args){
        int[] arr = {5, 10, 3, 8, 2};
        int result = secondLargest(arr);
        System.out.println(result);
    }

    static int secondLargest(int[] arr){
        int max = arr[0];
        int secLargest = arr[0];

        // just store the previous value of max in sec largest
        for (int j : arr) {
            if (j > max) { // 2 > 10
                secLargest = max;  // 5
                max = j; // 10
            } else if (j > secLargest && j != max){  // 2 > 8 && 8 != 10
                secLargest = j; // 8
            }
        }

        return secLargest;
    }
}
