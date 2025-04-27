package com.in28minutes.learn_spring_frameworkExaple1;

import org.springframework.stereotype.Component;

@Component
public class MySqlDbDataService implements DataService{
    @Override
    public int[] retriveData() {
        return new int[]{1,2,3,4,5};
    }
}
