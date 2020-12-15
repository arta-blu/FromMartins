package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner input = new Scanner(System.in);
    public static ArrayList<Recipe> recipeBook = new ArrayList<Recipe>();

//    private Recipe recipe = new Recipe("");
    public static void main(String[] args) {

        //DefaultRecipes defaultRecipes = new DefaultRecipes("aaa", "aaa", "aa", 155);



        //System.out.println(DefaultRecipes.defaultRecipe());
        //System.out.println(DefaultRecipes.defaultRecipe());



        System.out.print("Hello! Welcome to COOK BOOK! Enjoy Your experience!");
        Scanner input = new Scanner(System.in);

        instructions();

            boolean quit = false;
            int choice = 0;

            while (!quit) {
                System.out.print("Please select Your choice: ");
                choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 0:
                        instructions();
                        break;
                    case 1:
                     //   searchForRecipe();
                        break;
                    case 2:
                        addRecipe();
                        break;
                    case 3:
                        //  voteForRecipe();
                        break;
                    case 4:
                     //   addToFavorites();
                        break;
                    case 5:
                        quit = true;
                        break;
                }
            }
        }

    public static void addRecipe() {
        System.out.println("Is Your recipe dessert or healthy? For dessert write \"sweet\" for salad write \"healthy\"!");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("sweet")){
            Recipe.recipeInput();

            System.out.println("Do you want to add calories? (1- yes, 0 - no)");
            int answerCalories = input.nextInt();
            if (answerCalories == 1) {
                Sweet.addCalories();
            } else if (answerCalories == 0) {
                System.out.println("No calories added");
            } else {
                System.out.println("wrong answer");      // WHILE!!!!
            }
            Recipe.printUserRecipe();

        }else if (answer.equalsIgnoreCase("healthy")){

            Recipe.recipeInput();

            Healthy.isRecipeVegan();





        }else {
            System.out.println("Please try again!");
        }

    }



    private static void instructions() {

            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To search for recipes.");
            System.out.println("\t 2 - To add Your recipe.");
            System.out.println("\t 3 - To vote for recipe.");
            System.out.println("\t 4 - To add to favorites.");
            System.out.println("\t 5 - To quit the application.");

    }


}
