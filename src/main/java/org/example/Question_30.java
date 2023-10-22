package org.example;
// Program for nth fibonacci
public class Question_30 {
    public static void main(String[] args) {
        int n = 9;

        int a=0,b=1,c=0;

        if(n==0){
            System.out.println(a);
            return;
        }

        for(int i=2;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }

        System.out.println(b);
    }
}
