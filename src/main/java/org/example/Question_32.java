package org.example;
//32. Find maximum element in a given list of integers - using function calling, for loop
public class Question_32 {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9,10};
//        int max = a[0];
//
//        for(int i=1;i<a.length;i++){
//            max = Math.max(max,a[i]);
//        }
//
//        System.out.println(max);

        int max = a[0];

        for(int i=1;i<a.length;i++){
            if(a[i] > max){
                max = a[i];
            }
        }

        System.out.println(max);
    }
}
