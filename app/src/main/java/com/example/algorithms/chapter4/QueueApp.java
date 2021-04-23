package com.example.algorithms.chapter4;

public class QueueApp {
    public static void main(String[] args) {
        Queue theQueue = new Queue(10);

        theQueue.insert(10);
        theQueue.insert(30);
        theQueue.insert(20);
        theQueue.insert(40);

        theQueue.remove();


        // exercise 4.1
        theQueue.showItems();
    }
}

