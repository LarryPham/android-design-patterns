package com.capsule.patterns.criteria;

import java.util.List;

public class OrCriteria implements Filter {
    private Filter mCriteria;
    private Filter mOtherCriteria;

    public OrCriteria(Filter criteria, Filter otherCriteria) {
        this.mCriteria = criteria;
        this.mOtherCriteria = otherCriteria;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredientList) {
        List<Ingredient> firstCreteria = mCriteria.meetCriteria(ingredientList);
        List<Ingredient> nextCriteria = mOtherCriteria.meetCriteria(ingredientList);

        for (Ingredient ingredient: nextCriteria) {
            if (!firstCreteria.contains(ingredient)) {
                firstCreteria.add(ingredient);
            }
        }
        return firstCreteria;
    }
}
