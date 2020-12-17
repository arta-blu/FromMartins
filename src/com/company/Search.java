package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Search {

    public static void  searchForRecipe(ArrayList<Recipe> allRecipe) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please select search type (1 - by name, 2 - by ingredients) ");
        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                searchByName(allRecipe);
                break;
            case 2:
                searchByIngredients(allRecipe);
                break;
        }

    }

    private static void searchByIngredients(ArrayList<Recipe> allRecipe) {
        System.out.println("please enter Ingredient you want to search:");
        Scanner search = new Scanner(System.in);
        String userInput = search.nextLine();
        boolean isFound = false;

        for (Recipe s : allRecipe) {
            for (String ingredient : s.ingredients) {
                if (ingredient.contains(userInput)) {
                //if ((Arrays.asList(ingredient)).contains(userInput)) {
                    System.out.println("recipe found");
                    s.printUserRecipe();
                    System.out.println();
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println(userInput + " not found");
        }

    }

    private static void searchByName(ArrayList<Recipe> allRecipe) {
        System.out.println("please enter name you want to search:");
        Scanner search = new Scanner(System.in);
        String userInput = search.nextLine();
        boolean isFound = false;
        for (Recipe s : allRecipe) {
            if (userInput.equalsIgnoreCase(s.name)) {
                System.out.println("recipe founded");
                s.printUserRecipe();
                System.out.println();
                isFound = true;
            } else isFound = false;
        }
        if (!isFound) {
            System.out.println(userInput + " not found");
        }
    }
}
