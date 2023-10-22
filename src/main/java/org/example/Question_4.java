package org.example;
//4. Split the words in sentence
public class Question_4 {

    public static void main(String[] args) {
        String s = "Java is a Programming Language";
        String arr[] = s.split(" ");
        for (String i : arr){
            System.out.println(i);
        }
    }
}
