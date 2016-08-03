package com.julls;

import java.util.Scanner;

/**
 * Created by julia on 03.08.16.
 *
 */
class Triangle extends FigureImpl {
    private double a;
    private double h;
    private double S;

//DRY
    //Don't Repeat Yourself
    @Override
    public void haveUserAnswer() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please, type your a: ");
        a = sc.nextDouble();
        System.out.println("Please, type your h: ");
        h = sc.nextDouble();

    }

    @Override
    public void calculateSquare() {
        S = a*h/2;


    }

    @Override
    public void showAnswer() {
        System.out.println("Your square is: " + S);

    }

    @Override
    public String getMyName() {

        return "Triangle";

    }
}
