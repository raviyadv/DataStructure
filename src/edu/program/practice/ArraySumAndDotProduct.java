package edu.program.practice;

public class ArraySumAndDotProduct {
    public static void main(String[] args) {
        printArray(sum(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        printArray(multiplication(new int[][]{{1, 2}, {3,4}}, new int[][]{{5,6}, {7,8}}));
    }

    private static int[][] sum(int a[][], int b[][]) {

        int[][] sum = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        return sum;
    }

    private static int[][] multiplication(int[][] a, int[][] b) {
        int[][] mul = new int[2][2];
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                for (int k = 0; k < 2; k++)
                    mul[r][c] += a[r][k] * b[k][c];
            }
        }

















        return mul;
    }

    private boolean isArraySumPossible(int[][] a, int[][] b) {
        if (a.length != b.length)
            return false;
        return true;
    }

    static void printArray(int[][] array) {
        for (int[] arr : array) {
            System.out.println();
            for (int data : arr)
                System.out.print(data + " ");
        }

    }
}
