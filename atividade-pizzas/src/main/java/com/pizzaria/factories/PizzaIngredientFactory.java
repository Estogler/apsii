package com.pizzaria.factories;

import com.pizzaria.ingredients.interfaces.Cheese;
import com.pizzaria.ingredients.interfaces.Clams;
import com.pizzaria.ingredients.interfaces.Dough;
import com.pizzaria.ingredients.interfaces.Sauce;

// Esta é a Fábrica Abstrata
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClams();
    // Outros ingredientes podem ser adicionados aqui (ex: createVeggies)
}