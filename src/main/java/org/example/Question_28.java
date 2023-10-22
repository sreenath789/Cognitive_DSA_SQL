package org.example;

import java.util.HashMap;

//Find the highest frequent character in a string
public class Question_28 {

    public static void main(String[] args) {
        String s = "aaaaeeeefghccc";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        char ans = ' ';
        int max = Integer.MIN_VALUE;

        for(char ch : hm.keySet()){
            if(hm.get(ch) > max && ch > ans){
                ans = ch;
                max = hm.get(ch);
            }
        }

        System.out.println(ans);
    }
}
