package com.julls;

import java.util.Scanner;

/**
 * Created by julia on 03.08.16.
 *
 */
class Circle extends FigureImpl  {

    private double R;
    private double S;


    @Override
    public void haveUserAnswer() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, type your R: ");
        R = sc.nextDouble();

    }

    @Override
    public void calculateSquare() {
        S = R*R*Math.PI;

    }

    @Override
    public void showAnswer() {
        System.out.println("Your square is " + S);

    }

}
