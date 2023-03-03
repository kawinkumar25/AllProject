package org.example.calculator;


class Add extends Opertions
{
    Add(double a, double b)
    {
        super(a, b);
    }

    public void oper()
    {
        super.res = super.num1 + super.num2;
    }
}