package org.example;

import java.util.Arrays;

//15. Understand and implement all the Searching (Binary, Linear, Jump), Sorting
//        (Quick, Bubble, Merge, Insertion, Selection, heap) algorithms
public class Question_15 {
    public static void main(String[] args) {
        int a[] = {11, 4, 13, 7, 9, 10};

        //Linear search
//        int k = 9;
//        for(int i=0;i<a.length;i++){
//            if(a[i]==k){
//                System.out.println("Value Found : "+k);
//                break;
//            }
//        }

        //binary search(only when array is sorted)
//        Arrays.sort(a);
//        int start=0,end=a.length-1;
//        while(start<=end){
//            int mid = (start+end)/2;
//            if(a[mid]==k){
//                System.out.println("Value Found : "+k);
//                return;
//            }
//            else if(a[mid]>k){
//                end = mid-1;
//            }
//            else{
//                start= mid+1;
//            }
//        }
//        System.out.println("Value not found");

        //Selection sort
//        for(int i=0;i<a.length;i++){
//            int min = i;
//            for(int j=i+1;j<a.length;j++){
//                if(a[min]>a[j]){
//                    min=j;
//                }
//            }
//            int temp = a[min];
//            a[min] = a[i];
//            a[i]=temp;
//        }
//        for(int i : a){
//            System.out.print(i+" ");
//        }

        //Bubble sort
//        for(int i=0;i<a.length-1;i++){
//            for(int j=0;j<a.length-i-1;j++){
//                if(a[j] > a[j+1]){
//                    int temp = a[j];
//                    a[j] = a[j+1];
//                    a[j+1] = temp;
//                }
//            }
//        }
//
//        for(int i : a){
//            System.out.print(i+" ");
//        }

        //Insertion Sort
//        for(int i=1;i<a.length;i++){
//            int key = a[i];
//            int j = i-1;
//            while(j>=0 && a[j]>key){
//                a[j+1] = a[j];
//                j--;
//            }
//            a[j+1] = key;
//        }
//        for(int i : a){
//            System.out.print(i+" ");
//        }

        //merge sort

//        mergeSort(a, 0, n - 1);
//        for (int i = 0; i < n; i++) {
//            System.out.print(a[i] + " ");
//        }


    }

//    public static void mergeSort(int[] arr, int left, int right) {
//        if (left < right) {
//            int mid = left + (right - left) / 2;
//            mergeSort(arr, left, mid);
//            mergeSort(arr, mid + 1, right);
//            merge(arr, left, mid, right);
//        }
//    }

//    public static void merge(int[] arr, int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//        int[] leftArray = new int[n1];
//        int[] rightArray = new int[n2];
//        for (int i = 0; i < n1; i++) {
//            leftArray[i] = arr[left + i];
//        }
//        for (int i = 0; i < n2; i++) {
//            rightArray[i] = arr[mid + 1 + i];
//        }
//        int i = 0, j = 0, k = left;
//        while (i < n1 && j < n2) {
//            if (leftArray[i] <= rightArray[j]) {
//                arr[k] = leftArray[i];
//                i++;
//            } else {
//                arr[k] = rightArray[j];
//                j++;
//            }
//            k++;
//        }
//        while (i < n1) {
//            arr[k] = leftArray[i];
//            i++;
//            k++;
//        }
//        while (j < n2) {
//            arr[k] = rightArray[j];
//            j++;
//            k++;
//        }
//    }
}

