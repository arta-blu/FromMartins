package com.company;

public class Sweet extends Recipe{

    private String category;
    private int calories;



    public Sweet(String name, String[] ingredients, String description, double cookingTime, String category, int calories) {
        super(name, ingredients, description, cookingTime);
        this.category = category;
        this.calories = calories;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}
