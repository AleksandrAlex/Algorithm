package com.example.algorithms.chapter5_linkedList.priprityQueue;


// exercise 5.1
public class PriorityQueueBasedLinkedList {
    private FirstLastList theList;


    public PriorityQueueBasedLinkedList() {
        theList = new FirstLastList();
    }


    public boolean isEmpty() {
        return theList.isEmpty();
    }


    public void insert(long j) {
        theList.insertLast(j);
    }

    public Link remove() {
        return theList.deleteFirst();
    }

    public void displayQueue() {
        System.out.print("Queue (front-->rear): ");
        theList.displayList();
    }
}

class Link {
    public long dData;
    public Link next;

    public Link(long d) {
        dData = d;
    }


    public void displayLink() {
        System.out.print(dData + " ");
    }
}

class FirstLastList {
    private Link first;
    private Link last;


    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertLast(long key) {
        Link newLink = new Link(key);
        Link previous = null;
        Link current = first;

        while(current != null && key > current.dData){
            previous = current;
            current = current.next;
        }

        if(previous==null) first = newLink;
        else
            previous.next = newLink;
        newLink.next = current;
}

    public Link deleteFirst() {
        Link temp = first;
        if (!isEmpty()){
            first = first.next;
        }
        return temp;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println(" ");
    }
}







