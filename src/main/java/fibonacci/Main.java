package fibonacci;

import java.util.Scanner;

public class Main {

    private static long [] fibCash;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibCash = new long[n +1];

        System.out.println(fib(n));

    }

    private static long fib(int n){
        if (n<=1){
            return n;
        }
        if (fibCash[n] != 0){
            return fibCash[n];
        }
        long calculatedFib = fib(n-1) + fib(n-2);
        fibCash[n] = calculatedFib;

        return calculatedFib;
    }
}
