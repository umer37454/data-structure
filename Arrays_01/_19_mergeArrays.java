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
        int a = arr1.length;
        int b = arr2.length;
        int[] result = new int[a + b];

        for (int i = 0; i < arr1.length; i++){
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++){
            result[a + i] = arr2[i];
        }

        return result;
    }
}
