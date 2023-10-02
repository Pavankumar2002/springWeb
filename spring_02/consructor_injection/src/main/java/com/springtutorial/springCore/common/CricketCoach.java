package com.springtutorial.springCore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach {
    @Override
    public String getDailyWorkout() {
        return "practice bowling for 15 min!!!!!hehehe";
    }
}
