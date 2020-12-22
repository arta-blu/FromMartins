package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Recipe {

    public String name;
    public String[] ingredients;
    public String description;
    public int cookingTime;
    public double[] userVote;

    public Recipe(double[] userVote) {
        this.userVote = userVote;
    }

    public double[] getUserVote() {
        return userVote;
    }

    public void setUserVote(double[] userVote) {
        this.userVote = userVote;
    }

    public Recipe(String name, String[] ingredients, String description, int cookingTime, double[] userVote) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.cookingTime = cookingTime;
        this.userVote = userVote;
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

    public void recipeInput() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter recipe name");
        this.setName(input.nextLine());

        System.out.println("Please enter how many ingredients do you have");
        int numberOfIngredients;
        while (true) {
            numberOfIngredients = input.nextInt();
            if (numberOfIngredients <= 0) {
                System.out.println("The count of ingredients must be at least 1: ");
            } else if (numberOfIngredients > 30) {
                System.out.println("There is too much of ingredients. Please enter how many ingredients do you have:");
            } else break;
        }

        System.out.println("Please enter " + numberOfIngredients + " ingredients");
        String[] array = new String[numberOfIngredients];
        array[0] = input.nextLine();
        for (int i = 0; i < array.length; i++) { //reading array
            array[i] = input.nextLine();
        }
        String separator = "";
        System.out.println("ingredients:  ");
        for (String i : array) { // for printing array
            System.out.print(separator + i);
            separator = ", ";
        }
        setIngredients(array);
        System.out.println();

        System.out.println("Please describe a cooking process: ");
        setDescription(input.nextLine());

        System.out.println("Please indicate cooking time (minutes): ");
        int cookingTime;
        while (true) {
            cookingTime = input.nextInt();
            if (cookingTime <= 0) {
                System.out.println("The cooking time must be at least 1 minute. Please indicate cooking time (minutes): ");
            } else break;
        }
        setCookingTime(cookingTime);


        System.out.println("Vote how is your family liking your recipe? 5 - they like it a lot, 1 - no that much. :(");
        double[] array2 = new double[1];
        array2[0] = input.nextDouble();
        setUserVote(array2);
    }

    public void printUserRecipe() {
        System.out.println("Your recipe name: " + this.name);
        System.out.println("Ingredients: " + Arrays.toString(this.ingredients));
        System.out.println("Description: " + this.description);

        int cookingTime = this.cookingTime;
        int toHours = 0;
        int remainingMinutes = 0;
        if (cookingTime >= 60) {
            toHours = cookingTime / 60;
            remainingMinutes = cookingTime % 60;
            System.out.println("Cooking time " + toHours + " h and " + remainingMinutes + " min.");
        } else {
            System.out.println("Cooking time " + cookingTime + " min.");
        }


        double[] average = this.userVote;
        double sum = 0;
        for (int i = 0; i < average.length; i++) {
            sum = sum + average[i];
        }
        double avVote = (double) Math.round((sum / (average.length)) * 100.00) / 100.00;
        System.out.println("The average vote for this recipe is: " + avVote);
    }


    public void changeRecipe() {
        Scanner input = new Scanner(System.in);
        System.out.println("To change name press - 1, to change ingredients press - 2, to change description press - 3, to change rating press - 4");
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
            case 4:
                changeVote();
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
        while (true) {
            numberOfIngredients = input.nextInt();
            if (numberOfIngredients <= 0) {
                System.out.println("The count of ingredients must be at least 1: ");
            } else if (numberOfIngredients > 30) {
                System.out.println("There is too much of ingredients. Please enter how many ingredients do you have:");
            } else break;
        }
        System.out.println("Please enter " + numberOfIngredients + " ingredients");
        String[] array = new String[numberOfIngredients];
        array[0] = input.nextLine();
        for (int i = 0; i < array.length; i++) { //reading array
            array[i] = input.nextLine();
        }
        String separator = "";
        System.out.println("ingredients:  ");
        for (String i : array) { // for printing array
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

    private void changeVote() {
        // System.out.println("You told your family rated your recipe with " + this.userVote); When changing rating is giving answer: [D@2e0fa5d3
        System.out.println("Since you typed it wrong, please provide the new rating: ");
        Scanner scanner = new Scanner(System.in);
        double[] array2 = new double[1];
        array2[0] = scanner.nextDouble();
        setUserVote(array2);
    }
}





