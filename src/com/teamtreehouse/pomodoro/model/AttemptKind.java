package com.teamtreehouse.pomodoro.model;

/**
 * Created by EgorSiaskov on 22/07/16.
 */
public enum AttemptKind {
    FOCUS(25 * 60, "Focus Time"),
    BREAK(5 * 60, "Break Time");

    private int mTotalSeconds;
    private String mDisplayName;

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }


    public String getDisplayName() {
        return mDisplayName;
    }
}
