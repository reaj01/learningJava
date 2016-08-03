package com.julls;

import java.util.Scanner;

/**
 * Created by julia on 03.08.16.
 *
 */
class Circle implements Figures {

    private double R;
    private double S;

    void ask(){
        haveUserAnswer();
        calculateSquare();
        showAnswer();
    }

    @Override
    public void haveUserAnswer() {

        System.out.println("I am circle.");
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
