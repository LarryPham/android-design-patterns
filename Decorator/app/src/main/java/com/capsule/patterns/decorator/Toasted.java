package com.capsule.patterns.decorator;

public class Toasted extends BreadDecorator {

    private Bread mBread;

    public Toasted(Bread bread) {
        this.mBread = bread;
    }

    @Override
    public String getDescription() {
        return mBread.getDescription() + " Toasted";
    }

    @Override
    public int getKCal() {
        return mBread.getKCal();
    }
}
