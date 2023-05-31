package Arrays_01;

public class averageOf {
    public static void main(String[] args){
        int[] arr = {45,24,35,54,87,65,23,24,12};
        System.out.println(average(arr));
    }

    public static int average(int[] arr){
        int sum = 0;

        for(int i : arr){
            sum = sum + i;
        }

        return sum / arr.length;
    }
}