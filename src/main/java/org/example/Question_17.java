package org.example;
//17. Implement as many programs as possible in the areas Fibonacci series, Factorial
//        of a number using Recursion
public class Question_17 {

    static int n1=0,n2=1,n3=0;

    public static void main(String[] args) {

        //Factorial of a number
//        int n = 4;
//        System.out.println(fact(n));

        //Fibonacci series
//        System.out.print(n1+" "+n2);
//        int n = 10;
//        fibonacci(n-2);

        System.out.println(reverseNum(1679,0));

    }

    public static int fact(int n){
        if(n<=1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static void fibonacci(int n){
        if(n>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibonacci(n-1);
        }
    }

    static int reverseNum(int n,int ans){
         if(n<1){
             return ans;
         }
         return reverseNum(n/10,ans*10+n%10);
     }
}
