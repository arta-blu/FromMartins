package com.company;

import java.util.Scanner;

public class Main {
//    private Recipe recipe = new Recipe("");
    public static void main(String[] args) {



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
            System.out.println();

        }else if (answer.equalsIgnoreCase("healthy")){

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
