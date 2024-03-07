package Principal;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class Teste2 {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }


    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um numero");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {

                System.out.println("(" + i + "):" + Teste2.fibo(i) + "\t");
            }
        //if(Teste2.fibo(i) == n)
        }

    }

