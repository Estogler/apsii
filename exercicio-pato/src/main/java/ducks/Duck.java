package ducks;

import flying.FlyBehavior; // Importa a interface de comportamento de voo
import quacking.QuackBehavior; // Importa a interface de comportamento de grasno

public abstract class Duck {
    // Declarar duas variáveis de referência para os tipos de interface de comportamento.
    // Todas as subclasses as herdam. [cite: 5, 6]
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display(); // Método que cada pato deve implementar para exibir-se [cite: 8]

    public void performFly() {
        // Delega para a classe de comportamento. [cite: 10, 11]
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack(); // [cite: 14]
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!"); // [cite: 17]
    }

    // Métodos para alterar o comportamento em tempo de execução (Strategy Pattern)
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}