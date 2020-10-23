package com.moodanalyserproject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("SAD" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenMessage_WhenNotSad_ShoulReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            mood = moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY" , mood);
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void givenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = null;
        try {
            ExpectedException exceptionRule = ExpectedException.none();
            exceptionRule.expect(MoodAnalysisException.class);
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }

    }
}


