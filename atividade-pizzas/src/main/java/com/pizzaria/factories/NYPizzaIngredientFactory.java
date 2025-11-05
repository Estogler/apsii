package com.pizzaria.factories;

import com.pizzaria.ingredients.interfaces.*;
import com.pizzaria.ingredients.ny.*;

// Esta é a Fábrica Concreta para NY
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough(); //
    }

    public Sauce createSauce() {
        return new MarinaraSauce(); //
    }

    public Cheese createCheese() {
        return new ReggianoCheese(); //
    }

    public Clams createClams() {
        return new FreshClams(); //
    }
}