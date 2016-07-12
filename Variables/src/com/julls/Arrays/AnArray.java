package com.julls.Arrays;

/**
 * Created by julia on 12.07.16.
 *
 */
public class AnArray {
    public static void testArrays() {
        int [] anArray;
        anArray = new int[10];

        int i = 0;
        anArray [i++] = 1;
        anArray[i++] = 10;
        anArray[i++] = 100;
        anArray[i++] = 1000;
        anArray[i++] = 10 - anArray[0];
        anArray[i++] = anArray [3] - anArray [2];
        anArray[i++] = 800;
        anArray[i++] = 7;
        anArray[i++] = anArray[2]/anArray[1];
        anArray[i++] = anArray[4] + 5;


        find1000(anArray);

        int [] a = new int[10];

        copy(anArray, a);

        if(anArray[5] == a[5]){
            System.out.println("OK");
        }


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

    private static void copy(int[] anArray, int[] a) {
        for (int i = 0; i < anArray.length; i++) {
            a[i] = anArray[i];

        }


    }

    private static void find1000(int[] anArray) {

        for (int i = 0; i < anArray.length; i++) {

            if(anArray[i] == 1000){
                System.out.println("found in index " + i);
            }

        }



    }

}
