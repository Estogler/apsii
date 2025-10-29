package ducks;

import flying.FlyNoWay; // Começa sem poder voar (comportamento padrão)
import quacking.Quack; // Pode grasnar (comportamento padrão)

public class ModelDuck extends Duck {
    public ModelDuck() {
        // Inicializa o pato modelo com um comportamento de voo padrão de "não voar".
        flyBehavior = new FlyNoWay();

        // Inicializa o pato modelo com um comportamento de grasno padrão.
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck (can't fly yet!)");
    }
}