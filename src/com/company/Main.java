package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

        String str = "\u2606"; //star unicode


        System.out.println(str);

        Recipe recipe1 = new Recipe("Couscous", new String[]{"100 g couscous", "200ml hot low salt vegetable stock",
                "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"},
                "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve", 10);

        Recipe recipe2 = new Recipe("Sweet Potato & Beetroot Crisps", new String[]{"2 sweet potatoes", "2 beetroots",
                "1 garlic clove, minced", "1 tsp very finely minced fresh rosemary leaves", "2 tsp salt",  "2.5L vegetable oil"},
                "Wash the vegetables and dry very well. Set aside.\n" +
                        "In a small bowl combine the garlic, rosemary and salt. Set aside.\n" +
                        "Warm the oil in a large pot over high heat to 180°C.\n" +
                        "Trim 2cm off the end of each sweet potato. Using the V-slicer or mandoline, slice the sweet potatoes into " +
                        "very thin slices, about 1/4cm thick. Trim 2cm off the root end of the beets. Using the V-slicer or mandoline " +
                        "slice the beets into very thin slices, about 1/4cm thick.\n" +
                        "When the oil is hot add about a quarter of the sweet potato slices. Let fry until golden and the bubbling " +
                        "has almost completely subsided, about 2 to 3 minutes. Using a mesh sieve or slotted spoon remove the " +
                        "chips to a kitchen paper-lined baking tray. Sprinkle with some of the garlic, rosemary, and salt mixture. " +
                        "Continue with the remaining sweet potatoes. Transfer to a serving plate.\n" +
                        "Next, fry 1/4 of the beetroots. Let fry until curled at the edges and most of the bubbling has subsided, " +
                        "about 3 to 4 minutes. Transfer the beets to another kitchen paper-lined baking tray and sprinkle with salt mixture." +
                        " Continue with the remaining beetroots. Let cool and transfer to a serving plate.\n", 40);

        Recipe recipe3 = new Recipe("Caprese salad or tomatoes with mozzarella", new String[]{"3 mozzarella cheese balls",
                "3 tomatoes", "1 handful of fresh basil leaves", "Olive oil", "1 tbsp. balsamic (if desired)", "salt", "pepper "},
                "Tip: Mozzarella and tomato ratio 1: 1. If 2 mozzarella balls, then 2 tomatoes.\n" +
                        "Cut tomatoes and mozzarella into slices, arrange on a plate alternately. Pour with olive oil and balsamic " +
                        "vinegar, add a little salt, pepper, and decorate with basil leaves.", 5);

        Recipe recipe4 = new Recipe("Chocolate chia pudding", new String[]{"60g chia seeds", "400ml unsweetened almond " +
                "milk or hazelnut milk", "3 tbsp cacao powder", "2 tbsp maple syrup", "½ tsp vanilla extract", "cacao nibs , " +
                "mixed", "frozen berries"}, "Put all the ingredients in a large bowl with a generous pinch of sea salt " +
                "and whisk to combine. Cover with cling film then leave to thicken in the fridge for at least 4 hours, or overnight. " +
                "Spoon the pudding into four glasses, then top with the frozen berries and cacao nibs.\n",
                245);

        ArrayList<Recipe> allRecipe = new ArrayList<Recipe>();

        allRecipe.add(recipe1);
        allRecipe.add(recipe2);
        allRecipe.add(recipe3);
        allRecipe.add(recipe4);


        /*
        for (Recipe s : allRecipe) {
            System.out.println("Recipe name: " + s.name + ".\n" +
                    "Ingredients: " + Arrays.toString(s.ingredients) + ".\n"
                    + "Instructions: " + s.description + ".\n" + "Cooking time: " + s.cookingTime + " min.");
            System.out.println();
        }
        */

        /*

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
*/
        ///recipe1.printUserRecipe();

        Sweet sweetRecipe1 = new Sweet("Couscous salad", new String[]{"100 g couscous", "200ml hot low salt vegetable stock", "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"}, "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve", 10, 165);


        //System.out.println(DefaultRecipes.defaultRecipe());
        //System.out.println(DefaultRecipes.defaultRecipe());


        System.out.print("Hello! \u263a Welcome to COOK BOOK! Enjoy Your experience! \u2615");
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
                    Search.searchForRecipe(allRecipe);
                    break;
                case 2:
                    addRecipe();
                    break;
                case 3:
                      VoteRecipe.voteForRecipe(allRecipe);
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

