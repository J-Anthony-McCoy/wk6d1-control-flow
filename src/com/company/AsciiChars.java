package com.company;

public class AsciiChars
{


    public static void printNumbers()
    {
        System.out.println("***** ASCII TRANSLATION *****");
        System.out.println("Hi! Using the ASCII Table I'm printing out various characters within a specified range. \n");
        System.out.print("Here are the numbers: ");
        for(int i=48;i<=57;i++){
            System.out.print((char)i);
        }
        System.out.println();
    }

    public static void printLowerCaseLetters()
    {
        System.out.print("Here are the lowercase letters: ");
        for(int i=97;i<=122;i++){
            System.out.print((char)i);
        }
        System.out.println();
    }

    public static void printUpperCaseLetters()
    {
        System.out.print("Here are the uppercase letters: ");
        for(int i=65;i<=90;i++){
            System.out.print((char)i);
        }
        System.out.println();
    }

}