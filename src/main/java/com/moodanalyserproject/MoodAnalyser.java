/* Purpose: To add code to handle exception using exception class if user provides invalid mood */
package com.moodanalyserproject;

public class MoodAnalyser {
    String message;

    public MoodAnalyser (String message) {
        this.message = message;
    }

    public String analyseMood() throws MoodAnalysisException {
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }   catch (NullPointerException e) {
                throw new MoodAnalysisException("Please enter proper message");
        }
    }
}

