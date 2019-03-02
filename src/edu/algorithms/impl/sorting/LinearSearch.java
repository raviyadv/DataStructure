package edu.algorithms.impl.sorting;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {10, 3, 5, 3, 5, 6, 32, 56, 35};
        int searchResult = 32;
        for (int data : array)
            if (data == searchResult)
                System.out.println("Element Found");
    }
}
