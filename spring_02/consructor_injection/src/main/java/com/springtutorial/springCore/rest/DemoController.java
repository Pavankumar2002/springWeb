package com.springtutorial.springCore.rest;

import com.springtutorial.springCore.common.coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //private filed for dependency

    private coach mycoach;
// WWB BROWSER ~ DEMOCONTROLLER ~ COACH
    @Autowired
    public DemoController(coach myCoach){
        mycoach = myCoach;
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return mycoach.getDailyWorkout();
    }
}
