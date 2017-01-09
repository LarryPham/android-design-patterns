package com.capsule.patterns.criteria;

import java.util.List;

public class AndCriteria implements Filter {
    private Filter mCriteria;
    private Filter mOtherCriteria;

    public AndCriteria(Filter criteria, Filter otherCriteria) {
        this.mCriteria = criteria;
        this.mOtherCriteria = otherCriteria;
    }

    @Override
    public List<Ingredient> meetCriteria(List<Ingredient> ingredientList) {
       List<Ingredient> firstCriteria = mCriteria.meetCriteria(ingredientList);
        return mOtherCriteria.meetCriteria(firstCriteria);
    }
}
