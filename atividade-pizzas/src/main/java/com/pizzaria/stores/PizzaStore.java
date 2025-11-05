package com.pizzaria.stores;

import com.pizzaria.pizzas.Pizza;

public abstract class PizzaStore {

    // O método fábrica abstrato
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        System.out.println("--- Fazendo uma " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}