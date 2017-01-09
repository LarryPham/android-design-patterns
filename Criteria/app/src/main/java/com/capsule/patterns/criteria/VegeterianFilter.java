package com.capsule.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class VegeterianFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredientList) {
        List<Ingredient> vegetarian = new ArrayList<Ingredient>();

        for (Ingredient ingredient: ingredientList) {
            if (ingredient.isVegeterian()) {
                vegetarian.add(ingredient);
            }
        }
        return vegetarian;
    }
}
