package com.company.calculator;

public class Calculator {
    public void suma(int a,int b)
    {
        int result=a+b;
        System.out.println("a+b=" + result);
    }

    public void diferenta(int a,int b)
    {
        int result=a-b;
        System.out.println("a-b=" + result);
    }

    public void produs(int a,int b)
    {
        int result=a*b;
        System.out.println("a*b=" + a*b);
    }

    public void cat(int a, int b)
    {
        double result=a/(double)b;
        System.out.println("a/b=" + result);
    }
}
