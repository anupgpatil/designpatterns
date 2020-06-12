package com.designpatterns.strategypattern.problem;

/**
 * I am Duck Super CLass all other ducks should inherit me.
 */
public abstract class  Duck {

    public void quack() {
        System.out.println("Quacking-----> Quack Quack");
    }

    public void swim(){
        System.out.println("Swimming ----> Splish SPlash");
    }

    public abstract void display();

    public void fly(){
        System.out.println("Flying -----> Flip Flap");
    }
}
