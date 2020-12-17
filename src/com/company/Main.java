package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Recipe recipe1 = new Recipe("Couscous salad", new String[]{"100 g couscous", "200ml hot low salt vegetable stock", "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"}, "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve", 10);

        ///recipe1.printUserRecipe();

        Sweet sweetRecipe1 = new Sweet("Couscous salad", new String[]{"100 g couscous", "200ml hot low salt vegetable stock", "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"}, "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve", 10, 165);


        //System.out.println(DefaultRecipes.defaultRecipe());
        //System.out.println(DefaultRecipes.defaultRecipe());


        System.out.print("Hello! Welcome to COOK BOOK! Enjoy Your experience!");
        Scanner input = new Scanner(System.in);

        instructions();

        boolean quit = false;

        while (!quit) {
            System.out.print("Please select Your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 0:
                    instructions();
                    break;
                case 1:
                    Recipe.searchForRecipe();
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
            Recipe recipeFromUser = new Recipe(null, null, null, 0);
            recipeFromUser.recipeInput();

            System.out.println("Do you want to add calories? (1- yes, 0 - no)");
            int answerCalories = input.nextInt();
            if (answerCalories == 1) {
                Sweet.addCalories();
            } else if (answerCalories == 0) {
                System.out.println("No calories added");
            } else {
                System.out.println("wrong answer");      // WHILE!!!!
            }

            recipeFromUser.printUserRecipe();

            System.out.println("is it correct? (1- yes, 0 - no)");
            int correct;
            while(true) {
                correct = input.nextInt();
                if (correct != 1 && correct != 0) {
                    recipeFromUser.printUserRecipe();
                    System.out.println("is it correct? (1- yes, 0 - no)");
                } else if (correct == 0) {
                    System.out.println("Let's make changes in recipe");
                    recipeFromUser.changeRecipe();
                    System.out.println("Do you want to make other changes? (1- no, 0 - yes)");
                } else {
                    System.out.println("Your recipe is  submitted: ");
                    recipeFromUser.printUserRecipe();
                    break;
                }
            }


        }else if (answer.equalsIgnoreCase("healthy")){
            Recipe recipeFromUser = new Recipe(null, null, null, 0);
            recipeFromUser.recipeInput();

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
