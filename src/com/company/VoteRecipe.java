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
            System.out.println( i+" - "+ s.name); }


        System.out.println("Please indicate for which recipe you would like to vote: ");

        Scanner input = new Scanner(System.in);
        String clientChoice = input.nextLine();
        boolean isFound = false;
        int number = 0; //

        for (Recipe s : allRecipe) {
              number++;

                if ((clientChoice.equalsIgnoreCase(s.name))||(clientChoice.equals(Integer.toString(number)))) {
                    System.out.println("You chose to vote for: " + number + " "+ s.name);
                    isFound = true;

                    System.out.print("Please vote with: 5 - highest, 1 - lowest rating: ");
                    int vote = input.nextInt();

                    double[] average = s.userVote;
                    double sum = 0;
                    for (int j = 0; j < average.length; j++) {
                        sum = sum+average[j];
                    }
                    double avVote = Math.round((sum/(average.length))*100.00)/100.00;
                    double sum2 = Math.round(((vote + sum)/(average.length+1)) * 100.00) / 100.00;
                    String av1 = "The average vote for this recipe is: ";
                    String av2 = ", and you have added ";
                    String av3 = ", so the average vote is: ";

                    System.out.print("Thank you for your vote! Recipe: " + s.name + " gets rating: ");

                    String stars = "";
                    if(sum2 <= 1.4){
                        stars = "  \u2605 \u2606 \u2606 \u2606 \u2606 ! \n";
                    }else if(sum2 >= 1.5 && sum2 <= 2.4 ){
                        stars = "  \u2605 \u2605 \u2606 \u2606 \u2606 !\n";
                    }
                    else if(sum2 >= 2.5 && sum2 <= 3.4){
                        stars = "  \u2605 \u2605 \u2605 \u2606 \u2606 !\n";
                    }
                    else if(sum2 >= 3.5 && sum2 <= 4.4){
                        stars = "  \u2605 \u2605 \u2605 \u2605 \u2606 \n";
                    }
                    else if(sum2 >= 4.5 && sum<= 5){
                        stars = "  \u2605 \u2605 \u2605 \u2605 \u2605 \n";
                    }




                    if (vote == 1) {
                        System.out.println(" \u2605 \u2606 \u2606 \u2606 \u2606 ! \n" + av1 + avVote + av2 + vote + av3 + sum2 + stars);
                        break;
                    } else if (vote == 2) {
                        System.out.println(" \u2605 \u2605 \u2606 \u2606 \u2606 !\n" + av1 + avVote + av2 + vote + av3 + sum2 + stars);
                        break;
                    } else if (vote == 3) {
                        System.out.println(" \u2605 \u2605 \u2605 \u2606 \u2606 !\n" + av1 + avVote + av2 + vote + av3 + sum2 + stars);
                        break;
                    } else if (vote == 4) {
                        System.out.println(" \u2605 \u2605 \u2605 \u2605 \u2606 \n" + av1 + avVote + av2 + vote + av3 + sum2 + stars);
                        break;
                    } else if (vote == 5) {
                        System.out.println(" \u2605 \u2605 \u2605 \u2605 \u2605 \n" + av1 + avVote + av2 + vote + av3 + sum2 + stars);
                        System.out.println();
                    }else {
                        System.out.println("Please consider voting values (1 - 5)");
                    }
                }
        }
    }
}














