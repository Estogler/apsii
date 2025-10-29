package ducks;

import flying.FlyNoWay;
import quacking.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        // Patos de Borracha não voam e fazem 'Squeak'
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I look like a rubberduck"); // parece um rubberduck [cite: 52]
    }
}