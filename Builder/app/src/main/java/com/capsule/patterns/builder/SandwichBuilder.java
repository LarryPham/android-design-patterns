package com.capsule.patterns.builder;

public class SandwichBuilder {

    public static Sandwich readyMade() {
        Sandwich sandwich = new Sandwich();

        sandwich.addIngredient(new Bagel());
        sandwich.addIngredient(new SmokedSalmon());
        sandwich.addIngredient(new CreamCheese());
        return sandwich;
    }

    public Sandwich build(Sandwich sandwich, Ingredient ingredient) {
        sandwich.addIngredient(ingredient);
        return sandwich;
    }
}
