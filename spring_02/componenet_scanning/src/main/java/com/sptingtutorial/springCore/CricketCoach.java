package com.sptingtutorial.springCore;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements coach {
    @Override
    public String getDailyWorkout() {
        return "practice bowling for 15 min!!!!!hehehe";
    }
}
