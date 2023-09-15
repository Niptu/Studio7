package org.example;

public class MultipleChoice extends Question {

    String choice1;
    String choice2;
    String choice3;

    String correctAnswer;

    public MultipleChoice(int id, String question, String choice1, String choice2, String choice3, String correctAnswer) {
        super(id, question);
        this.choice1 = choice1;
        this.choice2 = choice2;
        this.choice3 = choice3;
        this.correctAnswer = correctAnswer;
    }

    //TODO: Create toString override


    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                choice1 + newline
                + choice2 + newline
                + choice3;
    }

    @Override
    public String answer() {
        String newline = System.lineSeparator();
        System.out.println(id + question + ":" + newline +
                choice1 + newline + choice2 +
                newline + choice3);


        return null;
    }
}