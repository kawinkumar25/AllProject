package org.example.calculator;

import java.util.Scanner;
import java.util.logging.Logger;

public class Calculator {
    public void perfrom()
    {
        double num1;
        double num2;
        char sym;
        double result;
        boolean bool = true;

        Scanner inp = new Scanner(System.in);
        Logger l = Logger.getLogger("kawin");
        l.info("Enter number: ");
        num1 =inp.nextDouble();
        Opertions obj;
        result=num1;
        l.info("Choose the symbol:\n Addition-> +\n Substraction-> -\n Multiplication->*\n Division->/\n Exit the calculator-> =");
        sym =inp.next().charAt(0);
        while(bool)
        {
            l.info("Enter number: ");
            num2 =inp.nextDouble();
            switch (sym)
            {
                case '+':
                    obj = new Add(result,num2);
                    obj.oper();
                    result = obj.res;
                    break;

                case '-':
                    obj = new Sub(result,num2);
                    obj.oper();
                    result = obj.res;
                    break;

                case '*':
                    obj = new Mul(result,num2);
                    obj.oper();
                    result = obj.res;
                    break;

                case '/':
                    obj = new Div(result,num2);
                    obj.oper();
                    result = obj.res;
                    break;
                default:
                    l.info("invalid choice");



            }

            String res = String.valueOf(result);
            l.info(res);
            l.info("Choose the symbol:\n Addition-> +\n Substraction-> -\n Multiplication->*\n Division->/\n Exit the calculator-> =");
            sym =inp.next().charAt(0);
            if(sym=='=')
            {
                bool = false;
                String res1 = String.valueOf(result);
                l.info(res1);
            }

        }
    }

}










