package com.in28minutes.learn_spring_frameworkExaple1;

import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BusinessCalculationService {
    private DataService dataService;
    public BusinessCalculationService(DataService dataService){
        super();
        this.dataService =dataService;
    }
    public int findMax(){
        return Arrays.stream(dataService.retriveData()).max().orElse(0);
    }

}
