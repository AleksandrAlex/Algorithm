package com.example.algorithms.chapter4;



// exercise 4.2
public class Deque {

    private int maxSize;
    private long[] deque;
    private int front;
    private int rear;
    private int nItems;

    public Deque(int size) {
        maxSize = size;
        deque = new long[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;

    }

    public void insertLeft(long item) {
        for (int i = nItems; i > 0; i--) {
            deque[i] = deque[i - 1];
        }
        deque[0] = item;
        nItems++;
        rear++;
    }

    public void insertRight(long item) {
        if (rear == maxSize - 1)
            rear = -1;
        deque[++rear] = item;
        nItems++;
    }

    public long removeLeft() {
        long removed = deque[0];
        for (int i = 0; i < nItems; i++) {
            deque[i] = deque[i + 1];
        }
        nItems--;
        rear--;
        return removed;
    }

    //
    public long removeRight() {
        long temp = deque[front++];
        if (front == maxSize)
            front = 0;
        nItems--;
        return temp;
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);

    }

    public void showDeque() {
        for (int i = 0; i < nItems; i++) {
            System.out.print(deque[i]+" ");
        }
    }

}
