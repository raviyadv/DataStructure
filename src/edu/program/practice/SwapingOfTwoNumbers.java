package edu.program.practice;

public class SwapingOfTwoNumbers {
    public static void main(String[] args) {
        swap(10,20);
    }
    private static void swap(int a,int b){
        System.out.println("Two Numbers Before Swapping A and B::"+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("Two Numbers After Swapping A and B::"+a+" "+b);


    }
}
