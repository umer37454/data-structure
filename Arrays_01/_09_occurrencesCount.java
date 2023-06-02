package Arrays_01;

public class _09_occurrencesCount {
    public static void main(String[] args){
        int[] arr = {4,2,5,8,7,5,4,5,4,5,1,4,59,6,4,4,7,4,1,23,6};
        int element = 5;

        int count = occurrences(arr,element);
        System.out.println(count);
    }

    public static int occurrences(int[] arr, int element){
        int count = 0;
        for(int i : arr){
            if(i == element){
                count++;
            }
        }
        return count;
    }
}