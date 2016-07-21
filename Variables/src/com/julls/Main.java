package com.julls;



public class Main {

    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int c = 5;
        int m = minimum(a, b, c);
        System.out.println(minimum(-15, 5, -23));
        System.out.println(minimum(7, 0, 3));
        System.out.println(minimum(-9, 96, -100));
        System.out.println(minimum(10, 9, 8));
        System.out.println(minimum(8, -5, 9));


    }

    private static int minimum(int a, int b) {
        if(a < b){
            return a;
        } else{
            return b;
        }
    }
    private static int minimum(int a, int b, int c) {
        int m = minimum(a, b);
        return minimum(m, c);


    }
}