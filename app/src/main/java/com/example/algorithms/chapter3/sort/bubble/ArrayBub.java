package com.example.algorithms.chapter3.sort.bubble;

public class ArrayBub {
    private long[] a;
    private int nElems;

    public ArrayBub(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public void display() {
        for (int j = 0; j < nElems; j++)
            System.out.print(a[j] + " ");
        System.out.println();
    }

    public void bubbleSort() {
        int left = 0, right = nElems - 1;
        while (left < right) {
            for (int pos = left; pos < right; pos++) {
                if (a[pos] > a[pos + 1])
                    swap(pos, pos + 1);
            }
            right--;

            for (int pos = right; pos > left; pos--) {
                if (a[pos] < a[pos - 1])
                    swap(pos, pos - 1);
            }
            left++;
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    public void oddSort() {
        int out, in;
        int j = 0;
        long[] odd = new long[nElems];
        int countElement = 0;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);

                for (int i = 0; i<nElems; i++){
                    if (a[i]%2 != 0){
                        odd[j] = a[i];
                        j++;
                        countElement++;
                    }
                }
                nElems = nElems - countElement;
                a = odd;
    }

    public void evenSort() {
        int out, in;
        int j = 0;
        long[] even = new long[nElems];
        int countElement = 0;
        for (out = nElems - 1; out > 1; out--)
            for (in = 0; in < out; in++)
                if (a[in] > a[in + 1])
                    swap(in, in + 1);

        for (int i = 0; i<nElems; i++){
            if (a[i]%2 == 0){
                even[j] = a[i];
                j++;
                countElement++;
            }
        }
        nElems = nElems - countElement;
        a = even;
    }
}
