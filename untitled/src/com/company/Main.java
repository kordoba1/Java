package com.company;

class Check
{
    public int CheckInt;
    public char CheckChar;
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        Check check = new Check();
        System.out.println("Uninitialized char: " + check.CheckChar + "\nint:"+ check.CheckInt);

        for(int i=0; i<args.length; i++)
            System.out.println(args[i]);
    }
}
