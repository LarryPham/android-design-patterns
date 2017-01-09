package com.capsule.patterns.criteria;

import java.util.List;

public interface Filter {
    List<Ingredient> meetCriteria(List<Ingredient> ingredientList);
}
