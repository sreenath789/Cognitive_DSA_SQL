package org.example;

//Find the odd and even numbers in an array
public class Question_1 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println(a[i]+" Even Number");
            }
            else{
                System.out.println(a[i]+" Odd Number");
            }
        }
    }
}
