package org.example;

import ducks.Duck;
import ducks.MallardDuck;
import ducks.ModelDuck; // Vamos adicionar um Pato Modelo para demonstrar a mudança de comportamento
import flying.FlyRocketPowered;
import ducks.RubberDuck;

public class Main {
    public static void main(String[] args) {
        // 1. Testa o Pato Real (Mallard)
        Duck mallard = new MallardDuck();
        System.out.println("--- Mallard Duck ---");
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        System.out.println();

        // 2. Testa o Pato de Borracha (Rubber)
        Duck rubber = new RubberDuck();
        System.out.println("--- Rubber Duck ---");
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        System.out.println();

        // 3. Demonstra a alteração dinâmica de comportamento em tempo de execução
        System.out.println("--- Rubber Duck Update ---");
        System.out.println("The rubber duck got a rocket!");

        // **Isto mostra o poder do padrão Strategy/Composição!**
        // Mesmo sendo um RubberDuck (que não voa), podemos injetar um novo FlyBehavior.
        rubber.setFlyBehavior(new FlyRocketPowered());
        rubber.performFly();

        System.out.println("\n-------------------------------------");
        System.out.println("Projeto implementado usando Composição (Princípio de Projeto)!"); //
    }
}