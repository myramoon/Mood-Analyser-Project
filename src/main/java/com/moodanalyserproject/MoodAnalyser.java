/* Purpose: To determine mood using analyseMood method */
package com.moodanalyserproject;

public class MoodAnalyser {

    public String analyseMood(String message) {
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
