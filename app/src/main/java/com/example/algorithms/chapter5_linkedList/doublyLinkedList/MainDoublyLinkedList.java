package com.example.algorithms.chapter5_linkedList.doublyLinkedList;

public class MainDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertLast(20);
        list.insertLast(10);
        list.insertLast(30);
        list.insertLast(40);

        list.displayForward();

        list.deleteLast();

        list.displayForward();

    }
}
