package com.capsule.patterns.builder;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Sandwich {

    private static final String DEBUG_TAG = "SandWich";
    private List<Ingredient> mIngredients = new ArrayList<Ingredient>();

    public void getCalories() {
        int totalCalories = 0;
        for (Ingredient ingredient: mIngredients) {
            totalCalories += ingredient.calories();
        }
        Log.d(DEBUG_TAG, "Total calories: " + totalCalories + " kCal");
    }

    public void addIngredient(Ingredient ingredient) {
        mIngredients.add(ingredient);
    }

    public void getSandwich() {
        for (Ingredient ingredient: mIngredients) {
            Log.d(DEBUG_TAG, ingredient.name() + " : " + ingredient.calories() + " kCal");
        }
    }
}
