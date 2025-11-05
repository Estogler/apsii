package com.pizzaria.stores;

import com.pizzaria.factories.NYPizzaIngredientFactory;
import com.pizzaria.factories.PizzaIngredientFactory;
import com.pizzaria.pizzas.*;

public class NYStylePizzaStore extends PizzaStore { //

    protected Pizza createPizza(String item) { //
        Pizza pizza = null;
        // Cria a fábrica de ingredientes de NY
        PizzaIngredientFactory ingredientFactory =
                new NYPizzaIngredientFactory(); //

        if (item.equals("queijo")) { //

            // Passa a fábrica para a Pizza
            pizza = new CheesePizza(ingredientFactory); //
            pizza.setName("Pizza de Queijo no Estilo de Nova York"); //

        } else if (item.equals("vegetariana")) { //

            pizza = new VeggiePizza(ingredientFactory); //
            pizza.setName("Pizza Vegetariana no Estilo de Nova York"); //

        } else if (item.equals("mariscos")) { //

            pizza = new ClamPizza(ingredientFactory); //
            pizza.setName("Pizza de Mariscos no Estilo de Nova York"); //

        } else if (item.equals("calabresa")) { //

            pizza = new PepperoniPizza(ingredientFactory); //
            pizza.setName("Pizza de Calabresa no Estilo de Nova York"); //
        }

        return pizza; //
    }
}