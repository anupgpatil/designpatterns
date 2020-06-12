package com.designpatterns.strategypattern;

import com.designpatterns.strategypattern.problem.MallardDuck;
import com.designpatterns.strategypattern.problem.RedDuck;
import com.designpatterns.strategypattern.problem.RubberDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategypatternApplication {

    public static void main(String[] args) {

        SpringApplication.run(StrategypatternApplication.class, args);
        problem();

    }

    private static void problem(){
        System.out.println("Mallard Duck Behaviors");
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();

        System.out.println("Red Duck Behaviors");

        RedDuck redDuck = new RedDuck();
        redDuck.quack();
        redDuck.swim();
        redDuck.display();

        System.out.println("Rubber Duckk Behaviors");

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();
        rubberDuck.swim();
    }

}
