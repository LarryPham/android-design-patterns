package com.capsule.patterns.criteria;

public class Ingredient {
    private String mName;
    private String mLocal;
    private boolean mVegeterian;

    public Ingredient(String name, String local, boolean vegeterian) {
        this.mName = name;
        this.mLocal = local;
        this.mVegeterian = vegeterian;
    }

    public String getName() {
        return mName;
    }

    public String getLocal() {
        return mLocal;
    }

    public boolean isVegeterian() {
        return mVegeterian;
    }
}
