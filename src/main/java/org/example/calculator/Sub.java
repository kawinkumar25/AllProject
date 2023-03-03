package org.example.calculator;


class Sub extends Opertions
{
    Sub(double a , double b)
    {
        super(a,b);
    }

    public void oper() {
        super.res = super.num1 - super.num2;
    }
}