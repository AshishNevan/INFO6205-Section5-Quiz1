package org.example;

public class InsertionSort {
    //Sorts the array using Insertion Sort.
    public void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            insert(i, a);
        }
    }

    private void insert(int i, Comparable[] a) {
        // Inserts the 'transition element' into its correct position in the sorted portion of the array.
        Comparable temp = a[i];
        int j = i - 1;

        // Shift elements of the sorted portion to the right until the correct position is found
        while (j >= 0 && a[j].compareTo(temp) > 0) {
            a[j + 1] = a[j];
            j--;
        }
        // Place the transition element at its correct position
        a[j + 1] = temp;
    }
    
    private void swap(Object[] a, int i, int j) {
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
