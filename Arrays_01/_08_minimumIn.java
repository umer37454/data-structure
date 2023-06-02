package Arrays_01;

public class _08_minimumIn {
    public static void main(String[] args) {
        int[] arr = {54, 25, 65, 35, 45, 87, 96, 32, 14, 2, 15};

        int smallest = min(arr);
        System.out.println(smallest);
    }

    public static int min(int[] arr) {
        int min = arr[0];

        for (int i : arr) {
            if (min >= i) {
                min = i;
            }
        }

        return min;
    }
}