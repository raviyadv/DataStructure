package edu.string;

public class MyString {
    public static void main(String[] args) {
        //lenghtOfString();
        convertIntoUpperCase();
    }

    /**to get the length of string without using length function/*
     *
     */
    private static void lenghtOfString(){
        String abc="Hello";
        char[] chars=abc.toCharArray();
        int i=0;
        for(;i<chars.length;i++);
        System.out.println(i);

        /**second approach/*
         */

        System.out.println(abc.indexOf('o')+1);
        System.out.println(abc.lastIndexOf('l'));
    }
    private static void convertIntoUpperCase(){
        String s="abc";
        char[] chars=s.toCharArray();
        for(int i=0;i<chars.length;i++)
            chars[i]-=32;

        for (char ch:chars)
        System.out.println(ch);
        s=new String(chars);
        System.out.println(s);
    }

}
