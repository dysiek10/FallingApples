package com.pluralsight.fruit;

public class Ananas implements IFruit {
    @Override
    public String getName() {
        return "Ananas";
    }

    @Override
    public int getRollMultiplier() {
        return 0;
    }
}
