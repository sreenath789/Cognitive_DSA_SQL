package org.example;
//Find the vowels and consonants in a word/sentence
public class Question_2 {
    public static void main(String[] args) {
        String s = "Sreenath";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u' ||
            ch == 'A' || ch == 'E' || ch=='I' || ch=='O' || ch=='U'){
                System.out.println(ch+" Vowel");
            }
            else if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                System.out.println(ch+" Consonant");
            }
        }
    }
}
