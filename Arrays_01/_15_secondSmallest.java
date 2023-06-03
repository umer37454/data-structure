package Arrays_01;

public class _15_secondSmallest {
    public static void main(String[] args){
        int[] arr = {5, 10, 3, 8, 2};
        int result = secondSmallest(arr);
        System.out.println(result);
    }

    static int secondSmallest(int[] arr){
        int secSmallest = arr[0];
        int min = arr[0];

        for (int j : arr) {
            if (j > min) {
                secSmallest = min;
                min = j;
            } else if (j != min && j > secSmallest) {
                secSmallest = j;
            }
        }

        return secSmallest;
    }
}
