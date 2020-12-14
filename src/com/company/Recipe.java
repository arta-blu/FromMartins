package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {

    private String name;
    private String [] ingredients;
    private String description;
    private double cookingTime;

    public Recipe(String name, String[] ingredients, String description, double cookingTime) {
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

    public void setCookingTime(double cookingTime) {
        this.cookingTime = cookingTime;
    }

    public  void addRecipe2(){
        System.out.println("Please enter the name of recipe");
        Scanner input = new Scanner(System.in);
        this.name = input.nextLine();

        System.out.println("Please enter how many ingredients You have");
       // Scanner input = new Scanner(System.in);
        int elements = input.nextInt();
        int ingredients [] = new int[elements];
        for (int i = 0; i < elements; i++) {
            ingredients [i]= input.nextInt();
        }
        for (int i: ingredients) {
            System.out.println(i);
        }


        }


    }





