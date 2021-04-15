package com.example.algorithms.algothm_chapter2;

public class Algorithm {

    private int[] arr;

    public Algorithm(int[] a) {
        arr = a;
    }

    // exercise 2.4 find method
    public int findIntoOrderedArray(int value) {
        int start = 0;
        int end = arr.length - 1;

        while (true) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (start > end) {
                return -1;
            } else {
                if (arr[mid] < value) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
    }

    // exercise 2.4 insert method
    public int insertIntoSortedArray(int value) {
        int[] newArray = new int[arr.length + 1];
        int j;
        for (j = 0; j < arr.length; j++) {
            newArray[j] = arr[j];
            if (arr[j] > value) {
                break;
            }
        }
        for (int i = arr.length; i > j; i--) {
            newArray[i] = arr[i - 1];
        }
        newArray[j] = value;
        arr = newArray;
        return j;
    }

    // exercise 2.1
    public int getMax() {
        if (arr.length == 0) {
            return -1;
        } else {
            int max = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= max) {
                    max = arr[i];
                }
            }
            return max;
        }
    }

    // exercise 2.2 and 2.3
    public int removeMax() {
        int[] newArray = new int[arr.length - 1];
        int max = getMax();
        int i;
        // search max value into array
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                break;
            }
        }
        // move all values to the left
        for (int j = i; j < arr.length - 1; j++) {
            arr[j] = arr[j + 1];
        }

        // write values into newArray without last item
        for (int a = 0; a < newArray.length; a++) {
            newArray[a] = arr[a];
        }
        arr = newArray;
        return max;
    }

    // before exercise 2.4
    public int[] orderArray() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp;
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.println(arr[i]);
        }
        return arr;
    }
}
