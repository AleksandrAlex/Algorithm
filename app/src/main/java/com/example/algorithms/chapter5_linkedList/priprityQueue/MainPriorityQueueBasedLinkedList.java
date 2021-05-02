package com.example.algorithms.chapter5_linkedList.priprityQueue;

public class MainPriorityQueueBasedLinkedList {
    public static void main(String[] args) {
        PriorityQueueBasedLinkedList queue = new PriorityQueueBasedLinkedList();
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(10);

        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();

        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(10);

        queue.displayQueue();
    }
}
