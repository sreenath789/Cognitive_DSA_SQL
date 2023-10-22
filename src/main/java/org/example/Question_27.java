package org.example;
//. Check whether a given string is palindrome or not using Time Complexity /
//        HashMap
public class Question_27 {

    public static void main(String[] args) {
        String s = "moM";
        s = s.replaceAll("\\s","").toLowerCase();
        char ch[] = s.toCharArray();
        if(palindrome(ch)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean palindrome(char ch[]){
        int i=0,j=ch.length-1;
        while(i<=j){
            if(ch[i]!=ch[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
