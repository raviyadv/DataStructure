package edu.algorithms.impl.sorting;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearchIterative(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 200));
        System.out.println(binarySearchByRecursiveCall(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90}, 200, 0, 9, (0 + 9 / 2)));
    }

    private static int binarySearchIterative(int[] sortetdArray, int element) {
        if (sortetdArray == null || element <= 1)
            return -1;
        int first = 0;
        int last = sortetdArray.length;
        int mid = first + last / 2;
        while (first != mid) {
            if (sortetdArray[mid] == element)
                return 1;
            if (sortetdArray[mid] > element)
                last = mid;
            else
                first = mid;
            mid = (first + last) / 2;
        }
        return -1;
    }

    private static int binarySearchByRecursiveCall(int[] sortedArray, int element, int first, int last, int mid) {
        if (sortedArray[mid] == element)
            return 1;
        else if (first == mid)
            return -1;

        if (sortedArray[mid] > element)
            last = mid;
        else
            first = mid;
        mid = (first + last) / 2;
        return binarySearchByRecursiveCall(sortedArray, element, first, last, mid);
    }
}
