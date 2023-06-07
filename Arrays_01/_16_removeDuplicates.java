package Arrays_01;

public class _16_removeDuplicates {
    public static void main(String[] args){
        int[] arr = {4,2,5,8,6,3,2,3,7,5};

        duplicate(arr);
        print(arr);
    }

    static void duplicate(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    arr[j] = -1;
                }
            }
        }
    }

    static void print(int[] arr){
        for (int j : arr) {
            if (j != -1) {
                System.out.print(j + " ");
            }
        }
    }
}