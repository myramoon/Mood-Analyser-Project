/* Purpose: To add code to handle exception if user provides invalid mood */
package com.moodanalyserproject;

public class MoodAnalyser {
    String message;

    public MoodAnalyser (String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }   catch (NullPointerException exception) {
                return "HAPPY";
        }
    }
}

