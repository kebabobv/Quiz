package com.miniphone.quiz;

public class TrueFalse {
    private int mQuestionID;// rappresenta id della domanda
    private boolean mAnswer; // rappresenta la risposta

    public static final String TAG = Class.class.getName();
    public TrueFalse(int mQuestionID,boolean mAnswer){
        this.mQuestionID = mQuestionID;
        this.mAnswer = mAnswer;

    }

    public int getmQuestionID() {
        return mQuestionID;
    }

    public boolean ismAnswer() {
        return mAnswer;
    }

    public void setmQuestionID(int mQuestionID) {
        this.mQuestionID = mQuestionID;
    }

    public void setmAnswer(boolean mAnswer) {
        this.mAnswer = mAnswer;
    }
}
