package com.capsule.patterns.criteria;

import android.os.Build;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LocalFilter implements Filter {

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredientList) {
        List<Ingredient> local = new ArrayList<Ingredient>();

        for (Ingredient ingredient: ingredientList) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                if (Objects.equals(ingredient.getLocal(), "Locally produced")) {
                    local.add(ingredient);
                }
            } else {
                if (ingredient.getLocal().equalsIgnoreCase("Locally produced")) {
                    local.add(ingredient);
                }
            }
        }
        return local;
    }
}
