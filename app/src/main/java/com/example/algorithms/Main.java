package com.example.algorithms;

public class Main {
    public static void main(String[] args) {

        // init array
        int arr[] = {2, 0, 4, 7, 9, 1};

        // create class to modify the array
        Algorithm algorithm = new Algorithm(arr);
        // get sorted array (before 2.4)
        algorithm.orderArray();


        // get value range
//        int a = algorithm.findIntoOrderedArray(6);
//        System.out.println(a);

        // get maximum value from array(can do it for both sorted and unsorted array) (2.1)
//        int max = algorithm.getMax();
//        System.out.println(max);

        // remove maximum value (2.2, 2.3)
//        int maxRemoved = algorithm.removeMax();
//        System.out.println(maxRemoved);


        // insert item into sorted array
        int i = algorithm.insertIntoSortedArray(8);
        System.out.println(i);





    }
}
