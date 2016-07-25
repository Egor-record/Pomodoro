package com.teamtreehouse.pomodoro.model;

/**
 * Created by EgorSiaskov on 22/07/16.
 */
public class Attempt {
    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String message) {
        mKind = kind;
        mMessage = message;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public void tick() {
        mRemainingSeconds--;
    }

    public void save() {
        System.out.printf("Saving %s %n", this);
    }
}
