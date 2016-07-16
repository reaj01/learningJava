package com.julls.operators;

/**
 * Created by julia on 14.07.16.
 *
 */
public class OperatorsDemo {
    public void demo() {

        int value1 = 1;
        int value2 = 3;
        int result;
        int x = 2;
        result = x > value2 ? value1 : value2;

        System.out.println(result);
    }

    public void demoCompound(){
        int a = 3;
        int b = 5;

        // by precedence:
        // postfix:
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);
        // prefix:
        ++a;
        System.out.println(a);
        // multiplicative:
        a = a*8;
        System.out.println(a);
        // additive:
        a = a-6;
        System.out.println(a);
        // relational:
        if (a > b)
        System.out.println("a > b"); //t
        if (a < b)
        System.out.println("a < b"); // f
        // equality:
        if (a == b)
            System.out.println("a = b"); // f
        if (a != b)
            System.out.println("a != b"); // t
        // assignment:
        a += 4;
        System.out.println(a);
        a *= 6;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

    }
}