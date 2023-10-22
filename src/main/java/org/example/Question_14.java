package org.example;
//Sort the numbers in ascending order
public class Question_14 {
    public static void main(String[] args) {
        int a[] = {100,2,1,4,8,3,5,7};

        for(int i=1;i<a.length;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && a[j]>key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }

        for(int i : a) System.out.print(i+" ");
    }
}
