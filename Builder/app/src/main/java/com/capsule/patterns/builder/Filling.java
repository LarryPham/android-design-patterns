package com.capsule.patterns.builder;

public abstract class Filling implements Ingredient {

    @Override
    public abstract String name();

    @Override
    public abstract int calories();
}
