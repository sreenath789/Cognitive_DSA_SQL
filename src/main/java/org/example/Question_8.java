package org.example;
//8. Generate Fibonacci series
public class Question_8 {
    public static void main(String[] args) {
        int val = 10;
        int n1=0,n2=1,n3=0;
        System.out.print(n1+" "+n2+" ");
        for(int i=2;i<=val;i++){
            n3 = n1+n2;
            System.out.print(n3+" ");
            n1 = n2;
            n2 = n3;
        }

    }
}
