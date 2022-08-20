package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
         list.insertFirst(70);
         list.insertFirst(30);
         list.insertFirst(56);
        System.out.println(list.deleteLast());
         list.display();
    }
}
