package com.bell.interview.henokanswer;

import org.springframework.util.StringUtils;

import java.util.Map;

public class Question1Answer {

    // Use array to preserve order
    static final String[] daysOfWeek = {"mon", "tue", "wed", "thu", "fri", "sat", "sun"};

    // Use map for getting order number in cosntant time
    static final Map<String, Integer> dayOfWeekMap = Map.of(
            "mon", 1,
            "tue", 2,
            "wed", 3,
            "thu", 4,
            "fri", 5,
            "sat", 6,
            "sun", 7
    );

    // Stores the current day
    String currentDay;

    /**
     * Constrcutor requires the current day to be specified on intialization
     * @param currentDay
     */
    public Question1Answer(String currentDay) {
        this.currentDay = currentDay;
    }

    /**
     * Returns the next day of week given a number.
     *
     * For example:
     *      Given, currentDay = "wed" and dayCount = 2, the function will return "Fri".
     *      Given, currentDay = "Sat" and dayCount = 23, the function should return "Mon"
     *
     * @param dayCount
     * @return
     */
    public String nextDay(int dayCount) {
        int startPos = dayOfWeekMap.get(currentDay.toLowerCase()) - 1;
        // assertEquals(expected, daysOfWeek[ (dayCount + startPos) % daysOfWeek.length ] );
        this.currentDay = daysOfWeek[ (dayCount + startPos) % daysOfWeek.length ];
        return StringUtils.capitalize(currentDay);
    }
}
