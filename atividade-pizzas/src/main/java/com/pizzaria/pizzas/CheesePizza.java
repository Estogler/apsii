package com.pizzaria.pizzas;

import com.pizzaria.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    // O construtor recebe a fábrica
    public CheesePizza(PizzaIngredientFactory ingredientFactory) { //
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparando " + name);
        // A fábrica é usada para criar os ingredientes!
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}