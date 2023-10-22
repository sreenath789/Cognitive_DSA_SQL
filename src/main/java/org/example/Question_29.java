package org.example;
//29. Write a program to get values of union-intersection of two arrays (get uncommon
//        values) A=[1,2,3,4,5] B = [5,6,7]

import java.util.ArrayList;
import java.util.List;

public class Question_29 {
    public static void main(String[] args) {
        int A[] = {1,2,3,4,5};
        int B[] = {5,6,7};

        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();

        for (int num : A) {
            listA.add(num);
        }

        for (int num : B) {
            listB.add(num);
        }


        List<Integer> intersection = new ArrayList<>(listA);
        intersection.retainAll(listB);

        List<Integer> uncommon = new ArrayList<>(listA);
        uncommon.addAll(listB);
        uncommon.removeAll(intersection);


        System.out.println("Uncommon values: " + uncommon);


    }
}
