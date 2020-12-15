package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {

    private String name;
    private String [] ingredients;
    public String description;
    private int cookingTime;

    public Recipe(String name, String[] ingredients, String description, int cookingTime) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.cookingTime = cookingTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(String[] ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public static void recipeInput(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter recipe name");
        String answerName = input.nextLine();


        System.out.println("Please enter how many ingredients do you have");
        int numberOfIngredients = input.nextInt();
        System.out.println("Please enter " + numberOfIngredients + " ingredients");
        String array [] = new String [numberOfIngredients];
        array[0] = input.nextLine();
        for (int i = 0; i < array.length; i++) { //reading array
            array[i] = input.nextLine();
        }
        System.out.println("ingredients:  ");
        for (String i : array){ // for printing array
            System.out.print(i + ", ");    //WHILE !!!
        }
        System.out.println();
        System.out.println("Please describe a cooking process: ");
        String description = input.nextLine();

        System.out.println("Please indicate cooking time (minutes): ");
        int cookingTime = input.nextInt();
    }

    public static void printUserRecipe(){
        System.out.println("Your recipe name:" );


    }


}





