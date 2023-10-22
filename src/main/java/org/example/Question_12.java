package org.example;
//12.Find if the word is a palindrome
public class Question_12 {

    public static void main(String[] args) {
        String s = "moM";
        s = s.toLowerCase();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }

        if(rev.equals(s)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }


}
