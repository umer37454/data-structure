//sum of n natural numbers without array
package Arrays_01;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int answer = sum(n);
        System.out.println(answer);
    }

    public static int sum(int n){
        return n * (n+1)/ 2;
    }
}