package com.julls.Arrays;

/**
 * Created by julia on 12.07.16.
 *
 */
public class AnArray {
    public static void testArrays() {
        int [] anArray;
        anArray = new int[10];
        anArray [0] = 1;
        anArray[1] = 10;
        anArray[2] = 100;
        anArray[3] = 1000;
        anArray[4] = 10 - anArray[0];
        anArray[5] = anArray [3] - anArray [2];
        anArray[6] = 800;
        anArray[7] = 7;
        anArray[8] = anArray[2]/anArray[1];
        anArray[9] = anArray[4] + 5;

        int[] secondArray = {
           100, 200, 300,
            400, 500, 600,
            700, 800, 900, 1000
        };

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Brown"}
        };






    }

}
