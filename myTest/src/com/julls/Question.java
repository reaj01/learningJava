package com.julls;

import java.util.Scanner;

/**
 * Created by julia on 28.07.16.
 */
public class Question {
    String question;
    String [] answers;
    int result;

    public Question(String question, String[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public void ask() {
        printQuestion();
        showAnswers();
        readUserAnswer();
    }

    private void readUserAnswer() {
        System.out.println("Your answer: ");
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();

    }

    private void showAnswers() {
        for (int i = 0; i < answers.length; i++) {
            String s = answers[i];
            System.out.println((i+1) + ". " + s);
        }


    }

    private void printQuestion() {
        System.out.println(question);
    }
}
