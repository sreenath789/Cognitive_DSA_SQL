package org.example;
//26. Given int a=2 another number given int b=3, int[]x={1,6,8,9,5} you have to add one
//        number from the given array with a so that it will become equal to b and return the
//        index of the array for which it matches.
public class Question_26 {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6,7,9};
        int a = 2;
        int b = 3;

        for(int i=0;i<arr.length;i++){
            int val = arr[i]+a;
            if(val==b){
                System.out.print(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
