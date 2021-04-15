package com.example.algorithms.chapter3.sort.inser;

public class MainInsertSort {
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayIns arr;
        arr = new ArrayIns(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(110);
        arr.insert(11);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        // exercise 3.1
        arr.insertionSort();

        arr.display();

        // exercise 3.2
        arr.median();

        // exercise 3.3
        arr.noDups();
        arr.display();
    }
}

