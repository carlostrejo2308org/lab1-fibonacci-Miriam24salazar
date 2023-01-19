package calidad;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacciR(int x){
        if(x==0 || x==1){
            return x;
        }
        return fibonacciR(x-1)+ fibonacciR(x-2);
    }
    
    public static int fibonacciI(int x){
        if(x==0 || x==1){
            return x;
        }
        int fib[]=new int[x+1];
        fib[0]=0;
        fib[1]=1;
        for (int i = 2; i < x+1; i++) {
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[x];
    }
        public static void main(String[] args) {
            System.out.println(fibonacciR(50));
     }
    
}
