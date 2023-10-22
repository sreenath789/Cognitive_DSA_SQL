package org.example;
//13.Write a program to compare two strings
public class Question_13 {

    public static void main(String[] args) {
        String s1 = "sreenath";
        String s2 = "sreenath";

        if(s1.length()!=s2.length()){
            System.out.println("Length must be same");
            return;
        }

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                System.out.println("Not equals");
                return;
            }
        }

        System.out.println("Two Strings are equal");
    }
}
