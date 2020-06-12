package com.designpatterns.strategypattern.problem;

public class RubberDuck extends  Duck{
    @Override
    public void display() {
        System.out.println("Display -------> I am a Rubber Duck");
    }

    @Override
    public void fly(){
        System.out.println("Fly -------> I am a Rubber Duck, I cannot Fly. This is an method with no implementation ");
    }
}
