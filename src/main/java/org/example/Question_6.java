package org.example;
//6. Find the highest number in an array
public class Question_6 {
    public static void main(String[] args) {
        int a[] = {1,3,4,5,10,100,2,5};

        int max = a[0];

        for(int i=1;i<a.length;i++){
            max = Math.max(a[i],max);
        }

        System.out.println(max+" Highest Number");
    }
}
