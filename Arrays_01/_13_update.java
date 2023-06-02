package Arrays_01;

import java.util.Arrays;

public class _13_update {
    public static void main(String[] args){
        int[] arr = {54,25,85,65,77,23};
        int element = 75;
        int index = 2;
        update(arr, element, index);
    }

    //update element at specific index
    static void update(int[] arr, int element, int index){
        for(int i = 0; i < arr.length; i++){
            if (i == index) {
                arr[index] = element;
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}