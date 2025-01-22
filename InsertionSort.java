package org.example;

import java.util.Arrays;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        //Inserts the 'Transition element' into its correct position in the sorted portion of the array.
        //TODO: TO BE IMPLEMENTED
        for (int j = i; j > 0; j--) {
            if (a[j].compareTo(a[j - 1]) < 0) {
                swap(a, j, j - 1);
            } else {
                break;
            }
        }
    }

    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        Integer[] array = {5, 3, 8, 6, 2, 7, 4, 1};

        System.out.println("Before sorting: " + Arrays.toString(array));
        sorter.sort(array);
        System.out.println("After sorting: " + Arrays.toString(array));
    }
}

