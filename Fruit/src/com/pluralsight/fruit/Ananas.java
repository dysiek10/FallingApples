package com.pluralsight.fruit;

public class Ananas implements IFruit {
    @Override
    public String getName() {
        return "Ananas Veggie";
    }

    @Override
    public int getRollMultiplier() {
        return 0;
    }
}
