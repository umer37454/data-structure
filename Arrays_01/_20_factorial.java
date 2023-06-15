package Arrays_01;

public class _20_factorial {
    public static void main(String[] args) {
        int n = 5;
        int result = factoria(n);

        System.out.println(result);
    }

    static int factoria(int n){
        int result = 1;

        for(int i = 1; i <= n; i++){
            result = result * i;
        }

        return result;
    }
}
