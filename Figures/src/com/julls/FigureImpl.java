package com.julls;

/**
 * Created by julia on 03.08.16.
 *
 */
abstract class FigureImpl implements Figures{

    void ask(){
        showWhoIAm();
        haveUserAnswer();
        calculateSquare();
        showAnswer();
    }

    private void showWhoIAm() {
        System.out.println("I'm a " + getMyName());
    }

    @Override
    public String getMyName() {
        return getClass().getName();
    }
}
