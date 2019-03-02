package edu.program.practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorialByIterative(10));
        System.out.println(findFactorialByRecursion(10));
    }

    private static int findFactorialByIterative(int number) {
        if (number <= 0)
            return 0;
        int sum = 1;
        for (int j = number; j > 1; --j)
            sum *= j;
        return sum;
    }

    private static int findFactorialByRecursion(int number) {
        if (number <= 1)
            return 1;
        return number * findFactorialByRecursion(--number);
    }
}
