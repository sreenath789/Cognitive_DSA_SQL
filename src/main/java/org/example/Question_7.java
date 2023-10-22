package org.example;
//7.Find the 3rd lowest number in an array
public class Question_7 {
    public static void main(String[] args) {
        int a[] = {100,2,1,4,8,3,5,7};

        //sort the array
//        for(int i=1;i<a.length;i++){
//            int key = a[i];
//            int j = i-1;
//            while(j>=0 && a[j]>key){
//                a[j+1] = a[j];
//                j--;
//            }
//            a[j+1] = key;
//        }
//
//        System.out.println("3rd Lowest Number : "+a[2]);

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            int curr = a[i];
            if(first > curr){
                third = second;
                second = first;
                first = curr;
            }
            else if(second > curr){
                third = second;
                second = curr;
            }
            else if(third > curr){
                third = curr;
            }
        }

        System.out.println("3rd Lowest Number : "+third);
    }
}
