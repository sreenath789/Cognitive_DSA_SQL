package org.example;
//25. Find first non repeated character in a string
public class Question_25 {
    public static void main(String[] args) {
        String s = "aabbeefgghh";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(s.indexOf(ch,s.indexOf(ch)+1)==-1){
                System.out.println(ch);
                return;
            }
        }

        System.out.println(-1);
    }
}
