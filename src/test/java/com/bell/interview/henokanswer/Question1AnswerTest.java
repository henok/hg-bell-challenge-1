package com.bell.interview.henokanswer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Question1AnswerTest {

    @Test
    public void testAnswer() {
        Question1Answer question1Answer = new Question1Answer("Sat");
        assertEquals("Mon", question1Answer.nextDay(23));

        Question1Answer question1Answer2 = new Question1Answer("Wed");
        assertEquals("Fri", question1Answer2.nextDay(2));

        Question1Answer question1Answer3 = new Question1Answer("Mon");
        assertEquals("Tue", question1Answer3.nextDay(1));
        assertEquals("Wed", question1Answer3.nextDay(1));
        assertEquals("Thu", question1Answer3.nextDay(1));
        assertEquals("Fri", question1Answer3.nextDay(1));
        assertEquals("Sat", question1Answer3.nextDay(1));
        assertEquals("Sun", question1Answer3.nextDay(1));
        assertEquals("Mon", question1Answer3.nextDay(1));

        Question1Answer question1Answer4 = new Question1Answer("Mon");
        assertEquals("Wed", question1Answer4.nextDay(2));
        assertEquals("Fri", question1Answer4.nextDay(2));
        assertEquals("Sun", question1Answer4.nextDay(2));
        assertEquals("Tue", question1Answer4.nextDay(2));
        assertEquals("Thu", question1Answer4.nextDay(2));
        assertEquals("Sat", question1Answer4.nextDay(2));
        assertEquals("Mon", question1Answer4.nextDay(2));

        Question1Answer question1Answer5 = new Question1Answer("Mon");
        assertEquals("Thu", question1Answer5.nextDay(500));
    }


}
