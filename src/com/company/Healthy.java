package com.company;

public class Healthy extends Recipe {

    private boolean isVegan;

    public Healthy(String name, String[] ingredients, String description, double cookingTime, boolean isVegan) {
        super(name, ingredients, description, cookingTime);
        this.isVegan = isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}
