package com.julls;

/**
 * Created by julia on 28.07.16.
 *
 */
public class PsychoTest {
    int sumResult;

    public PsychoTest(Question[] questions, TestResults results) {
        this.questions = questions;
        this.results = results;

    }

    Question [] questions;
    TestResults results;


    public void run() {
        askQuestions();
        calcAnswers();
        printResult();
    }

    private void printResult() {
        String res = results.calcResult(sumResult);
        System.out.println("Your result: " + sumResult);

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
