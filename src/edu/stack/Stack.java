package edu.stack;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

public class Stack<T> {
    private static final int MAX_SIZE=1000;
    private int top=-1;
    private T[] stack;
    public Stack(){
        stack= (T[]) new Object[MAX_SIZE];
     //   stack= (T[]) createArray(Object.class,MAX_SIZE);
    }
    public boolean push(T data){
        if(top==MAX_SIZE) {
            System.out.println("Stack OverFlow");
            return false;
        }
        stack[++top]=data;
        return true;
    }
    public T pop(){
        if(top<=-1){
            System.out.println("Stack is under flow ..");
            return null;
        }
        return stack[top--];
    }
    public boolean isEmpty(){
        if(top<=-1)
            return true;
        return false;
    }

    public static <T> T[] createArray(Class<T> type, int size){
        return (T[])Array.newInstance(type, size);
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        System.out.println(stack.stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.push(100));
        System.out.println(stack.push(200));
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
    }

}
