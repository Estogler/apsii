package com.pizzaria;

import com.pizzaria.pizzas.Pizza;
import com.pizzaria.stores.NYStylePizzaStore;
import com.pizzaria.stores.PizzaStore;

public class Main {

    public static void main(String[] args) {
        // Cria a loja de NY
        PizzaStore nyStore = new NYStylePizzaStore();

        // Pede uma pizza de queijo
        Pizza pizza1 = nyStore.orderPizza("queijo");
        System.out.println("O cliente pediu uma " + pizza1.getName() + "\n");
        System.out.println(pizza1);

        System.out.println("-------------------------------------\n");

        // Pede uma pizza de mariscos
        Pizza pizza2 = nyStore.orderPizza("mariscos");
        System.out.println("O cliente pediu uma " + pizza2.getName() + "\n");
        System.out.println(pizza2);
    }
}