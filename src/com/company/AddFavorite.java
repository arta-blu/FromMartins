package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFavorite {

    public static void addToFavorite(ArrayList<Recipe> allRecipe) {

        System.out.println();
        System.out.println("RECIPE LIST: ");
        int i = 0;
        for (Recipe s : allRecipe) {
            i++;
            System.out.println(i + " - " + s.name);
        }

        System.out.println("Choose which recipe You would like to add to favorite?");

        Scanner input = new Scanner(System.in);
        String clientChoice = input.nextLine();
        int number = 0;
        for (Recipe s : allRecipe) {
            number++;
            if ((clientChoice.equalsIgnoreCase(s.name)) || (clientChoice.equals(Integer.toString(number)))) {
                System.out.println("You choose to vote for: " + number + " " + s.name);
                System.out.println("Recipe added to favorite \u2661 ");

                break;
            } //else {System.out.println("Please choose a recipe from list");}

        }



    }
}




