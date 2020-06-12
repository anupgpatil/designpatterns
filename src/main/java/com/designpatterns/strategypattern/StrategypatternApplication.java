package com.designpatterns.strategypattern;

import com.designpatterns.strategypattern.problem.MallardDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategypatternApplication {

    public static void main(String[] args) {

        SpringApplication.run(StrategypatternApplication.class, args);
        problem();

    }

    private static void problem(){
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.quack();
        mallardDuck.swim();
        mallardDuck.display();
    }

}
