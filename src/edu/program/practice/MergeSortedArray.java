package edu.program.practice;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] a={1,2,4,6,10,30};
        int[] b={3,4,5,20,50};

        int[] c=new int[a.length+b.length];
        int j=0;
        int k=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i] <= b[j]) {
                c[k] = a[i];
                ++k;
                continue;
            }
            c[k]=b[j];
            ++j;
            ++k;
            --i;
        }
        if(j!=b.length)
        {
            for(;j<b.length;j++)
                c[k]=b[j];
        }
        for (int i:c)
            System.out.println(i);
    }
}
