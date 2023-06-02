package Arrays_01;

public class _01_sumOf {
    public static void main(String[] args){
        int[] arr = {55,54,85,69,23,47,69,52};
        int sum = sum(arr);
        System.out.println(sum);
    }

    public static int sum(int[] arr){
        int sum = 0;

        for(int i : arr){
            sum = sum + i;
        }

        return sum;
    }
}
