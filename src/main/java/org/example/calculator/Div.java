package org.example.calculator;


class Div extends Opertions {
    Div(double a, double b) {
        super(a, b);
    }

    public void oper() {
        super.res = super.num1 / super.num2;
    }
}