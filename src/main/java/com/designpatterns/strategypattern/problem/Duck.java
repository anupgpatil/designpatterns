package com.designpatterns.strategypattern.problem;

/**
 * I am Duck Super CLass all other ducks should inherit me.
 */
public  class  Duck {

    public void quack() {
        System.out.println("Generic Quacking-----> Quack Quack");
    }

    public void swim(){
        System.out.println("Generic Swimming ----> Splish SPlash");
    }

    public  void display(){ System.out.println("Generic Diplay ----> Duck Display"); }

    public void fly(){ System.out.println("Generic Flying -----> Flip Flap"); }
}
