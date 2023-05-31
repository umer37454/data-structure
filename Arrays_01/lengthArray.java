package Arrays_01;

public class lengthArray {
    public static void main(String[] args) {
        int[] arr ={4,5,2,6,9,7,2,3,6,9,9};

        int length = lengthOfArray(arr);
        System.out.println(length);
    }

    public static int lengthOfArray(int[] arr){
        int length = arr.length;
        return length;
    }
}
