package com.capsule.patterns.builder;

public class Bun extends Bread {
    @Override
    public String name() {
        return "Bun";
    }

    @Override
    public int calories() {
        return 150;
    }
}
