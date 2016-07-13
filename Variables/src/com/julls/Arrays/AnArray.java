package com.julls.Arrays;

/**
 * Created by julia on 12.07.16.
 *
 */
public class AnArray {
    public void testArrays() {
        char[] anArray;
        anArray = new char[10];

        int i = 0;
        anArray[i++] = 'm';
        anArray[i++] = 'r';
        anArray[i++] = 'x';
        anArray[i++] = 'd';
        anArray[i++] = 'v';
        anArray[i++] = 'c';
        anArray[i++] = 't';
        anArray[i++] = 'z';
        anArray[i++] = 'b';
        anArray[i++] = 'a';


        char[] secondArray = java.util.Arrays.copyOfRange(anArray, 2, 9);
        System.out.println(new String(secondArray));
        System.out.println(new String(secondArray));


    }
}

