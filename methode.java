package opps;

import java.util.Scanner;

public class methode {
    static int fibo(int n){
        if(n <= 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
//        int x = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number");
        int x = sc.nextInt();

        System.out.println(fibo(x));
    }
}
