package com.company;

import java.util.Scanner;

public class Healthy extends Recipe {

    private boolean isVegan;

    public Healthy(String name, String[] ingredients, String description, int cookingTime, boolean isVegan) {
        super(name, ingredients, description, cookingTime);
        this.isVegan = isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }


    public static void isRecipeVegan() {
        System.out.println("Does your food contain meat, dairy, eggs, animal? (1 - yes, 0 - no)");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == 1) {
            System.out.println("Your recipe is not vegan");
        } else if (answer == 0) {
            System.out.println("Your recipe is  vegan");
        } else {
            System.out.println("Wrong answer :("); // WHILE
        }

    }

}

