package org.example.calculator;

class Mul extends Opertions {
    Mul(double a, double b) {
        super(a, b);
    }


    public void oper() {
        super.res = super.num1 * super.num2;
    }
}