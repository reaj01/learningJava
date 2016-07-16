package com.julls;


import com.julls.Arrays.AnArray;
import com.julls.DataTypes.DataTypes;
import com.julls.operators.InstanceOfDemo;
import com.julls.operators.OperatorsDemo;

public class Main {

    static int gears = 4; // static field the same number of gears will apply to all instances
    int speed = 10; // non-static field, unique to each instance of a class

    public static void main(String[] args) {
        methodAndParameter(5, 3);

        int currentSpeed = 6; // local variable, which is between the opening and closing braces of a method.

        //don't write STATIC and NON-STATIC field in the method. It's ONLY in the beginning of the class (watch above)

//        new AnArray().testArrays();
//        new OperatorsDemo().demo();
//        new InstanceOfDemo().demo();
        new OperatorsDemo().demoCompound();

    }

    public static void methodAndParameter(int first, double second){ // these are parameters in the brackets

    }



}