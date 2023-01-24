package calidad;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacciR(int num){
        if(num==0 || num==1){
            return num;
        }
        return fibonacciR(num-1)+ fibonacciR(num-2);
    }
    
    public static int fibonacciI(int num){
        
        
        
        if(num==0 || num==1){
            return num;
        }
        
        else if (num>=2){ 
            int fib[]=new int[num+1];
            fib[0]=0;
            fib[1]=1;
            for (int i = 2; i < num+1; i++) {
                fib[i]=fib[i-1]+fib[i-2];
            }
            return fib[num];
        }
   
        else {
           int fb []=new int[1];
            fb[0]=-1;
           
            return fb[0]; 
        }
        
        
        
    }
        public static void main(String[] args) {
            System.out.println(fibonacciI(10));
     }
    
}
