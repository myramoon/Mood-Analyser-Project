/* Purpose: To refactor the code to take mood message in constructor */
package com.moodanalyserproject;

public class MoodAnalyser {
    String message;

    public MoodAnalyser (String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}

