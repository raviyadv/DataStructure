package edu.program.practice;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{10,20,30,40,50}));
    }
    private static int sum(int[] array){
        int sum=0;
        int i=0;
        for(;i<0;){
            System.out.println("Hello");
            sum+=array[i];
            i++;
        }
        return sum;
    }
}
