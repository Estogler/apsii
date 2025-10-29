package ducks;

import flying.FlyNoWay;
import quacking.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        // Patos Isca não voam e são mudos
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I look like a decoyduck"); // parece um decoyduck [cite: 63]
    }
}