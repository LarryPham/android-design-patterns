package com.capsule.patterns.builder;

public class SmokedSalmon extends Filling {
    @Override
    public String name() {
        return "Smoked Salmon";
    }

    @Override
    public int calories() {
        return 400;
    }
}
