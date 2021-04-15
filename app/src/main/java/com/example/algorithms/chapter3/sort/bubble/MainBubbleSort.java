package com.example.algorithms.chapter3.sort.bubble;

public class MainBubbleSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayBub arr;
        arr = new ArrayBub(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        // exercise 3.1
        arr.bubbleSort();
        arr.display();

        // exercise 3.4
//        arr.oddSort();
//        arr.display();

        // exercise 3.4
        arr.evenSort();
        arr.display();
    }
}
