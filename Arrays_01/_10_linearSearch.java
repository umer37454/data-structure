package Arrays_01;
import java.util.Scanner;

public class _10_linearSearch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Length of an array");
        int length = in.nextInt();

        int[] arr = new int[length];

        System.out.println("Enter elements of an array");
        for(int i = 0; i < length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Searching element");
        int element = in.nextInt();

        boolean result = searchElement(arr,element);
        System.out.println(result);
    }

    public static boolean searchElement(int[] arr,int element){
        for(int i: arr){
            if(i == element){
                return true;
            }
        }
        return false;
    }
}