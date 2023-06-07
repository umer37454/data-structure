package Arrays_01;

import java.util.Arrays;

public class _19_mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {21,52,36,87,5};
        int[] arr2 = {53,14,65,854,87,5};
        int[] result = merge(arr1,arr2);

        System.out.println(Arrays.toString(result));
    }

    static int[] merge(int[] arr1, int[] arr2){
        int size = arr1.length + arr1.length;
        int[] result = new int[size];

        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i];
        }

        for (int j = 0; j < arr2.length; j++){
            result[arr1.length + 1 + j] = arr1[j];
        }

        return result;
    }
}
