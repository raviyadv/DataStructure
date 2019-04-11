package edu.array;

public class SortedArrayList {
    public static void main(String[] args) {
      //  int[] array = {4, 5, 7, 9, 11, 22, 44, 45, 67, 0, 0};
      //  isSorted(array, 24);
          negativeNumberShifting();
    }

    private static void isSorted(int[] array, int element) {
        int currentIndex = 9;
        int j = currentIndex - 1;
        while (element < array[j]) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = element;
        for (int data : array) {
            System.out.print(data + " ");
        }
        System.out.println();
        for (int i = 0; i < currentIndex; i++) {
            if (!(array[i] < array[i + 1])) {
                System.out.println("Not Sorted..");
                return;
            }
        }
        System.out.println("Sorted...");
    }

    private static void negativeNumberShifting() {
        int[] array = {-1, 2, 4, -2, 5, 6, -3, 5, -4, 5};
        int i = 0;
        int j = array.length - 1;
        int temp;
        while (i < j) {
            while (array[i] <= 0)
                i++;
            while (array[j] >= 0)
                j--;
            if(i<j) {
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //result - -1 -4 -3 -2  5  6 4 5   2 5
        for (int data : array)
            System.out.print(data + " ");
    }

}
