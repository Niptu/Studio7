package org.example;

public abstract class Question {
    int id;
    int nextId = 1;
    String question;

    //TODO: Set a constructor

    public Question(int id, String question) {
        this.id = id;
        this.question = question;
    }


    //TODO: Getters and Setters

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getNextId() {
        return nextId;
    }

    //TODO: To String method


    @Override
    public String toString() {
        return id + question + ": ";
    }

    //TODO: Abstract answer method
    public abstract String answer();
}