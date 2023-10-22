package org.example;
//3. Reverse a string without using built in methods

public class Question_3 {
    public static void main(String[] args) {
        String s = "sreenath";

        //1st method
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);

        //2nd method
        String secondType = "";
        for(int i=0;i<s.length();i++){
            secondType = s.charAt(i) + secondType;
        }
        System.out.println(secondType);
    }
}
