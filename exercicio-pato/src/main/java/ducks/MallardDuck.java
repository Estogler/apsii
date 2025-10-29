package ducks;

import flying.FlyWithWings;
import quacking.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        // Patos-reais voam e grasnam
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I look like a mallard"); // parece um mallard [cite: 49]
    }
}