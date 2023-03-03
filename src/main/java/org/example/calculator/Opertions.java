package org.example.calculator;


abstract class Opertions
{
    double num1;
    double num2;
    double res;

    Opertions (double a,double b)
    {
        this.num1=a;
        this.num2=b;
    }
    public abstract void oper();
}