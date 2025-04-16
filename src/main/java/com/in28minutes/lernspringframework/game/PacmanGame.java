package com.in28minutes.lernspringframework.game;

import com.in28minutes.learn_spring_framework.GamingConsole;
import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
    public void up() {
        System.out.println(" PacmanGame jump");
    }

    public void down() {
        System.out.println("PacmanGame Go into a hole");
    }

    public void left() {
        System.out.println("PacmanGame Go back");
    }

    public void right() {
        System.out.println("PacmanGame Accelerate");
    }
}
