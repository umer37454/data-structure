package Arrays_01;

import java.util.Arrays;

public class deletion {
    public static void main(String[] args){
        int[] arr = {54,25,63,87,56,14};

        int element = 25;

        int[] result = delete(arr,element);
        System.out.println(Arrays.toString(result));
    }

    static int[] delete(int[] arr, int element){
        int[] result = new int[arr.length - 1];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                for(int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j+1];
                }
            }
        }

        for(int k = 0; k < result.length; k++){
            result[k] = arr[k];
        }
        return result;
    }
}
