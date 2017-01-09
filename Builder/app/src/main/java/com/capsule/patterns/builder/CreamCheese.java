package com.capsule.patterns.builder;

public class CreamCheese extends Filling {
    @Override
    public String name() {
        return "Cream Cheese";
    }

    @Override
    public int calories() {
        return 350;
    }
}
