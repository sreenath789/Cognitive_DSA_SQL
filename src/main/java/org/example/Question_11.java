package org.example;
//11. Find the factorial of a number using recursion
public class Question_11 {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fact(n));
    }

    public static int fact(int n){
         if(n<=1){
             return 1;
         }
         return n*fact(n-1);
     }
}
