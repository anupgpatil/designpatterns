package com.designpatterns.strategypattern.problem;

public class WoodenDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Display -------> I am a Wooden Duck");
    }

    @Override
    public void quack() {
        System.out.println("Swim -------> I am a Wooden Duck, I cannot Quack. This is an method with no implementation ");
    }

    @Override
    public void fly(){
        System.out.println("Fly -------> I am a Wooden Duck, I cannot Fly. This is an method with no implementation ");
    }

}
