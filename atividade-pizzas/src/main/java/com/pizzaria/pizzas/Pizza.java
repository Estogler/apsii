package com.pizzaria.pizzas;

import com.pizzaria.ingredients.interfaces.*;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clams;

    // Método abstrato para preparação de ingredientes
    // A fábrica será usada aqui pelas subclasses.
    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Métodos comuns
    public void bake() {
        System.out.println("Assando por 25 minutos a 350 graus");
    }

    public void cut() {
        System.out.println("Cortando a pizza em fatias diagonais");
    }

    public void box() {
        System.out.println("Colocando a pizza na caixa oficial da PizzaStore");
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (clams != null) {
            result.append(clams);
            result.append("\n");
        }
        return result.toString();
    }
}