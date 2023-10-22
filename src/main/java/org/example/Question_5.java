package org.example;
//5. Find the prime numbers in an array
public class Question_5 {
    public static void main(String[] args) {
        int a[] = {0,1,3,4,2};

        for(int i=0;i<a.length;i++){
            int val = a[i];
            boolean isPrime = true;

            if(val==1||val==0){
                isPrime=false;
            }

            for(int j=2;j<=val/2;i++){
                if(val%j==0){
                    isPrime=false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(val+" Prime Number");
            }
        }
    }
}
