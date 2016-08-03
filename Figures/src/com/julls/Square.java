package com.julls;

import java.util.Scanner;

/**
 * Created by julia on 03.08.16.
 *
 */
class Square implements Figures {

    private double a;
    private double b;
    private double S;

    void ask(){
        haveUserAnswer();
        calculateSquare();
        showAnswer();
    }

    @Override
    public void haveUserAnswer() {

        System.out.println("I am square.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, type your a: ");
        a = sc.nextDouble();
        System.out.println("Please, type your b: ");
        b = sc.nextDouble();
    }

    @Override
    public void calculateSquare() {
        S = a*b;

    }

    @Override
    public void showAnswer() {
        System.out.println("Your square is: " + S);

    }
}
