package edu.array;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 11, 13, 15};
        int[] b = {2, 8, 12, 15, 19, 20, 22};
        int c[] = new int[a.length + b.length];

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                k++;
                i++;
            } else {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if (i < a.length - 1) {
            for (; j < a.length; i++) {
                c[k] = a[i];
                k++;
            }
        }
        if (j < b.length - 1) {
            for (; j < b.length; j++) {
                c[k] = b[j];
                k++;
            }
        }
        for (int data : c)
            System.out.print(data + " ");
    }

}

