package org.example;

import java.util.HashMap;

//Find the 1st non repeated element - [1,2,1,3,3,5,4,4]
public class Question_33 {

    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,2,4,5,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : a){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        for(int i : a){
            if(hm.get(i)==1){
                System.out.println(i);
                return;
            }
        }

        System.out.println(-1);
    }
}
