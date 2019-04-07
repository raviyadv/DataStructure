package edu.recurrence;

public class TypesOfRecurrence {
    public static void main(String[] args) {
    //   nestedRecurrence(A());
    }
    public void tailRecurrence(int n){
        if(n>0)
        {
            System.out.println(n);
            tailRecurrence(n-1);
        }
    }
    public void headRecurrence(int n){
        if(n>0){
            headRecurrence(n-1);
            System.out.println(n);
        }
    }

    /**
     * In linear recurrence the function call itself is one time.
     * But in tree recurrence the function call to itself is more than one time.
     */
    public void treeRecurrence(int n){
        if(n>0){
            System.out.println(n);
            treeRecurrence(n-1);
            treeRecurrence(n-1);
        }
    }
    public static int indirectRecurrence(){
        A();
        return 0;
    }
    public static int A(){
        indirectRecurrence();
        return 100;
    }
    public static int  nestedRecurrence(int n){
        if(n>0)
        {
            System.out.println(n);
            nestedRecurrence(nestedRecurrence(10));
        }
        return 100;
    }
}
