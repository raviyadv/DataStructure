package edu.program.practice;

public class FibonacciNumber
{
    public static void main(String[] args) {
        System.out.println(getFibonacciNumber(9));
    }
    private static int getFibonacciNumber(int n)
    {
        if(n<=1)
            return 1;
        return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
    }
}
