package com.capsule.patterns.decorator;

public class LowFatSpread extends BreadDecorator {

    private Bread mBread;

    public LowFatSpread(Bread mBread) {
        this.mBread = mBread;
    }

    @Override
    public String getDescription() {
        return mBread.getDescription() + " Low fat spread";
    }

    @Override
    public int getKCal() {
        return mBread.getKCal() + 25;
    }
}
