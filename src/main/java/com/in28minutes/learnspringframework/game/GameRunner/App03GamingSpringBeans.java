package com.in28minutes.learnspringframework.game.GameRunner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(GameConfrigation.class)){
            context.getBean(GameRunner.class).run();

        }
//        var game = new MarioGame();
//        //var game = new SuperContraGame();
//        var gameRunner = new GameRunner(game);
//
//        gameRunner.run();
    }
}
