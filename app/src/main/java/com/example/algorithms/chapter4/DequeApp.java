package com.example.algorithms.chapter4;



// exercise 4.2
public class DequeApp {
    public static void main(String[] args) {
        Deque deque = new Deque(1);

        deque.insertRight(10);
        deque.insertRight(20);

        deque.insertLeft(30);
        deque.insertLeft(40);

        deque.insertRight(50);
        deque.insertRight(60);

        deque.insertLeft(70);
        deque.insertLeft(80);

        deque.removeRight();
        deque.removeLeft();
        deque.removeLeft();

        System.out.println(deque.isEmpty());
        System.out.println(deque.isFull());


        deque.showDeque();
    }
}

