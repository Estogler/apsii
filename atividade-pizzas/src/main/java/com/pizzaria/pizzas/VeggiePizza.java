package com.pizzaria.pizzas;

import com.pizzaria.factories.PizzaIngredientFactory;

// Stub criado para o código da NYStylePizzaStore compilar
public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) { //
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparando " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        // Aqui também seriam criados os vegetais
    }
}