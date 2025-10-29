package ducks;

import flying.FlyWithWings;
import quacking.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        // Patos Ruivos voam e grasnam
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I look like a redhead"); // parece um redhead [cite: 50]
    }
}