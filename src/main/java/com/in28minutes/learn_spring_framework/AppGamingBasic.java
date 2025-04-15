package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class AppGamingBasic {
    public static void main(String[] args) {
//        var game = new MarioGame();
//        //var game = new SuperContraGame();
//        var gameRunner = new GameRunner(game);
//
//        gameRunner.run();

        var context = new AnnotationConfigApplicationContext(HelloConfrigation.class);
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
    }
}
