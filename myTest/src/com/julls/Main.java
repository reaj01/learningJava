package com.julls;

public class Main {

    public static void main(String[] args) {

        QuestionFactory factory = new QuestionFactory();
        TestResults testResults = new TestResults();

	PsychoTest psychoTest = new PsychoTest(factory.create(), testResults);
        psychoTest.run();
    }
}
