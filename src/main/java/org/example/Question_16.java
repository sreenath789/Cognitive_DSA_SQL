package org.example;

public class Question_16 {
    public static void main(String[] args) {
        LL l = new LL();
        int a[] = {1,2,3,4,5,6,7};
        for(int i : a){
            l.insertLast(i);
        }

        l.display();
    }
}
class LL{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public void insertLast(int data){
        Node node = new Node(data);

        if(head==null){
            head = node;
            return;
        }

        Node last = head;
        while(last.next!=null){
            last = last.next;
        }

        last.next = node;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
