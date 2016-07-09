package com.julls;

/**
 * Created by julia on 09.07.16.
 *
 */
public class StaticDemo {

    static int count;

    public StaticDemo() {
        count = count + 1;
    }

    public static int getCount(){
        return count;

    }

}
