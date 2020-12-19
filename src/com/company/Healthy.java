package com.company;

import java.util.Scanner;

public class Healthy extends Recipe {

    private boolean isVegan;

    public Healthy(String name, String[] ingredients, String description, int cookingTime, boolean isVegan, int[]userVote) {
        super(name, ingredients, description, cookingTime, userVote);
        this.isVegan = isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }


    public static void isRecipeVegan() {
        System.out.println("Does your food contains meat, poultry, fish, dairy, eggs or foods made by bees? (1 - yes, 0 - no)");
        Scanner input = new Scanner(System.in);
        //int answer = input.nextInt();
        int answer;
        while(true) {
            answer = input.nextInt();
            if (answer != 1 && answer != 0) {
                System.out.println("Does your food contains meat, poultry, fish, dairy, eggs or foods made by bees? (1 - yes, 0 - no)");
            } else break;
        }
        if (answer == 1) {
            System.out.println("Your recipe is not vegan");
        } else {
            System.out.println("Your recipe is  vegan");
        }

    }

}

