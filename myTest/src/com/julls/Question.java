package com.julls;

import java.util.Scanner;

/**
 * Created by julia on 28.07.16.
 *
 */
class Question {
    private String question;
    private String [] answers;
    int result;

    Question(String question, String[] answers) {
        this.question = question;
        this.answers = answers;
    }

    void ask() {
        printQuestion();
        showAnswers();
        readUserAnswer();
    }

    private void readUserAnswer() {
        Scanner sc = new Scanner(System.in);

        do{


        System.out.println("Your answer: ");

        result = sc.nextInt();

        }while(result < 1 || result > 3);


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
