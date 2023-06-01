package Arrays_01;

public class copyingArray {
    public static void main(String[] args){
        int[] arr = {54,52,87,56,63,14,4};

        int[] result = copying(arr);
        printArray(result);
    }

    static int[] copying(int[] arr){
        int[] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            result[i] = arr[i];
        }

        return result;
    }

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
}
