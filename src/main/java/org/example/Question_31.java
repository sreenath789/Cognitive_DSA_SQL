package org.example;

import java.util.HashMap;

//31. Write a program to find the element from an array which has the most frequency?
public class Question_31 {

    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,2,4,5,4,5};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : a){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }

        int val = a[0];
        int max = hm.get(a[0]);

        for(int key : hm.keySet()){
            if(max<hm.get(key)){
                val = key;
                max = hm.get(key);
            }
        }

        System.out.println(val);
    }

}
