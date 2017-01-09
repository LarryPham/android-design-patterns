package com.capsule.patterns.criteria;

import java.util.ArrayList;
import java.util.List;

public class NonLocalFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredientList) {
        List<Ingredient> nonLocal = new ArrayList<Ingredient>();

        for (Ingredient ingredient: ingredientList) {
            if (ingredient.getLocal() != "Locally produced") {
                nonLocal.add(ingredient);
            }
        }
        return nonLocal;
    }
}
