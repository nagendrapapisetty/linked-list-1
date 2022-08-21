package com.linkedlist;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        Queue<Integer>queue = new ArrayDeque<>();
         list.insertFirst(70);
         list.insertFirst(30);
         list.insertFirst(56);
        list.insert(40,1);
         list.display();
        System.out.println(list.delete(2));
    }
}
