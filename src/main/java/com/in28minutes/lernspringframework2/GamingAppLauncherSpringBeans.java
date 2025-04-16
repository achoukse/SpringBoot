package com.in28minutes.lernspringframework2;

import com.in28minutes.lernspringframework.game.GameRunner;
import com.in28minutes.lernspringframework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.in28minutes.lernspringframework.game")
public class GamingAppLauncherSpringBeans {

    public static void main(String[] args) {


        try (var context =
                     new AnnotationConfigApplicationContext(GamingAppLauncherSpringBeans.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

        }

    }
}
