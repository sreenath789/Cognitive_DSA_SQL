package org.example;
//10. Find the missing numbers in series
public class Question_10 {
    public static void main(String[] args) {
        int a[] = {1,2,4,6,7,9,10};

        int min = a[0];
        int max = a[0];

        for(int i : a){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }

        boolean[] visited = new boolean[max - min + 1];
        for(int num : a){
            visited[num-min]=true;
        }

        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                System.out.println(i+min);
            }
        }

    }
}
