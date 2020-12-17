package com.company;

import java.util.Arrays;
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

    public void recipeInput(){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter recipe name");
        this.setName(input.nextLine());

        System.out.println("Please enter how many ingredients do you have");
        int numberOfIngredients;
        while(true) {
            numberOfIngredients = input.nextInt();
            if (numberOfIngredients <= 0) {
                System.out.println("The count of ingredients must be at least 1: ");
            } else if (numberOfIngredients > 30) {
                System.out.println("There is too much of ingredients. Please enter how many ingredients do you have:");
            } else break;
        }

        System.out.println("Please enter " + numberOfIngredients + " ingredients");
        String[] array = new String [numberOfIngredients];
        array[0] = input.nextLine();
        for (int i = 0; i < array.length; i++) { //reading array
            array[i] = input.nextLine();
        }
        String separator = "";
        System.out.println("ingredients:  ");
        for (String i : array){ // for printing array
            System.out.print(separator + i);
            separator = ", ";
        }
        setIngredients(array);
        System.out.println();

        System.out.println("Please describe a cooking process: ");
        setDescription(input.nextLine());

        System.out.println("Please indicate cooking time (minutes): ");
        int cookingTime;
        while(true) {
            cookingTime = input.nextInt();
            if (cookingTime <= 0) {
                System.out.println("The cooking time must be at least 1 minute. Please indicate cooking time (minutes): ");
            } else break;
        }
        setCookingTime(cookingTime);
    }

    public void printUserRecipe(){
        System.out.println("Your recipe name:" + this.name);
        System.out.println("Ingredients:" + Arrays.toString(this.ingredients));
        System.out.println("Description:" + this.description);
        System.out.println("Cooking time:" + this.cookingTime);
    }


    public static void  searchForRecipe() {
        Scanner input = new Scanner(System.in);

        System.out.print("Please select search type (1 - by name, 2 - by ingredients) ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                searchByName();
                break;
            case 2:
               // searchByIngredients();
                break;
        }

    }

    static void searchByName() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
   //     if (userInput.equalsIgnoreCase(this.name)) {
    //        System.out.println("recipe founded");
    //    } else System.out.println("not found");
    }


    public void changeRecipe() {
        Scanner input = new Scanner(System.in);
        System.out.println("To change name press - 1, to change ingredients press - 2. to change description press - 3))");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                changeName();
                break;
            case 2:
                 changeIngredients();
                break;
            case 3:
                changeDescription();
                break;
        }
    }

    private void changeName() {
        System.out.println("Old name of recipe is: " + this.name);
        System.out.println("Please enter new name: ");
        Scanner input = new Scanner(System.in);
        String newName = input.nextLine();
        setName(newName);
        System.out.println("The new name of recipe is: " + this.name);
    }

    private void changeIngredients() {
        System.out.println("Old ingredients are: " + Arrays.toString(this.ingredients));

        System.out.println("Please enter how many ingredients do you have");
        int numberOfIngredients;
        Scanner input = new Scanner(System.in);
        while(true) {
            numberOfIngredients = input.nextInt();
            if (numberOfIngredients <= 0) {
                System.out.println("The count of ingredients must be at least 1: ");
            } else if (numberOfIngredients > 30) {
                System.out.println("There is too much of ingredients. Please enter how many ingredients do you have:");
            } else break;
        }
        System.out.println("Please enter " + numberOfIngredients + " ingredients");
        String[] array = new String [numberOfIngredients];
        array[0] = input.nextLine();
        for (int i = 0; i < array.length; i++) { //reading array
            array[i] = input.nextLine();
        }
        String separator = "";
        System.out.println("ingredients:  ");
        for (String i : array){ // for printing array
            System.out.print(separator + i);
            separator = ", ";
        }
        setIngredients(array);
        System.out.println();
        System.out.println("The ingredients are: " + Arrays.toString(this.ingredients));
    }

    private void changeDescription() {
        System.out.println("Old description is: " + this.description);
        System.out.println("Please enter new description: ");
        Scanner input = new Scanner(System.in);
        String newDescription = input.nextLine();
        setDescription(newDescription);
        System.out.println("The new description of recipe is: " + this.description);
    }


}





