package com.company;

import java.util.Scanner;

public class Sweet extends Recipe{

    //private String category;
    private int calories;



    public Sweet(String name, String[] ingredients, String description, int cookingTime,  int calories) {
        super(name, ingredients, description, cookingTime);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public static void addCalories() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many calories does your dessert have:");
        int caloriesCount = input.nextInt();
        System.out.println("Your recipe has " + caloriesCount + " calories");

        //portions count
    }

}
