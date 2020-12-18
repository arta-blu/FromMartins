package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class VoteRecipe {

    public static void voteForRecipe(ArrayList<Recipe> allRecipe) {

        System.out.println();
        System.out.println("RECIPE LIST: ");
        int i = 0;
        for (Recipe s : allRecipe) {
            i++;
            System.out.println( i+"."+ s.name); }


        System.out.println("Please indicate for which recipe you would like to vote: ");

        Scanner input = new Scanner(System.in);
        String clientChoice = input.nextLine();
        boolean isFound = false;
        int number = 0; //

        for (Recipe s : allRecipe) {
              number++;

                if ((clientChoice.equalsIgnoreCase(s.name))||(clientChoice.equals(Integer.toString(number)))) {
                    System.out.println("You chose to vote for: " + number+ " "+ s.name);
                    isFound = true;

                    System.out.print("Please vote with: 5 - highest, 1 - lowest rating: ");
                    int vote = input.nextInt();

                    if (vote == 1) {
                        System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2605 \u2606 \u2606 \u2606 \u2606!");
                        break;
                    } else if (vote == 2) {
                        System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2605 \u2605 \u2606 \u2606 \u2606 !");
                        break;
                    } else if (vote == 3) {
                        System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2605 \u2605 \u2605 \u2606 \u2606 !");
                        break;
                    } else if (vote == 4) {
                        System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2605 \u2605 \u2605 \u2605 \u2606 !");
                        break;
                    } else if (vote == 5) {
                        System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2605 \u2605 \u2605 \u2605 \u2605 !");
                        System.out.println();
                    }else {
                        System.out.println("Please consider voting values (1 - 5)");
                    }
                }
            }
        }
    }



















      /*  for (Recipe s : allRecipe) {
            for (String ingredient : s.ingredients) {
                if (ingredient.contains(clientChoice.toLowerCase())) {
                    System.out.println("You have voted for: " );
                    System.out.println("Rate chosen recipe, 5 - highest, 1 - lowest rating");

                    while (true) {
                        int vote = input.nextInt();
                        if (vote <= 0 || vote > 5) {
                            System.out.println("Please vote with: 5 - highest, 1 - lowest rating: ");
                        }
                        if (vote == 1) {
                            System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2606 !");
                        } else if (vote == 2) {
                            System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2606 \u2606 !");
                        } else if (vote == 3) {
                            System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2606 \u2606 \u2606 !");
                        } else if (vote == 4) {
                            System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2606 \u2606 \u2606 \u2606 !");
                        } else if (vote == 5) {
                            System.out.println("Thank you for your vote! Recipe: " + s.name + " gets rating: \u2606 \u2606 \u2606 \u2606 \u2606 !");
                        }
                    }
                } break; //can't exit the loop!
            }break; //can't exit the loop!
        }
    }


    }*/

    //{
//        System.out.println("please enter Ingredient you want to search:");
//        Scanner search = new Scanner(System.in);
//        String userInput = search.nextLine();
//        boolean isFound = false;
//
//        for (Recipe s : allRecipe) {
//            for (String ingredient : s.ingredients) {
//                if (ingredient.contains(userInput.toLowerCase(Locale.ROOT))) {
//                //if ((Arrays.asList(ingredient)).contains(userInput)) {
//                    System.out.println("recipe found");
//                    s.printUserRecipe();
//                    System.out.println();
//                    isFound = true;
//                }
//            }
//        }
//        if (!isFound) {
//            System.out.println(userInput + " not found");
//        }
//
//    }

        //  Main.recipeBook.add(new Sweet(name, ingredients, description, cookingTime, category, calories));