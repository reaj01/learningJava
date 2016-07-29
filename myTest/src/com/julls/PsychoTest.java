package com.julls;

/**
 * Created by julia on 28.07.16.
 *
 */
class PsychoTest {
    private int sumResult;

    PsychoTest(Question[] questions, TestResults results) {
        this.questions = questions;
        this.results = results;

    }

    private Question [] questions;
    private TestResults results;


    void run() {
        askQuestions();
        calcAnswers();
        printResult();
    }

    private void printResult() {
        String res = results.calcResult(sumResult);
        System.out.println("Your result: " + res);


    }

    private void calcAnswers() {
        for (Question question : questions) {
            sumResult += question.result;
        }

    }

    private void askQuestions() {
        for (Question question : questions) {
            question.ask();
        }
    }
}
