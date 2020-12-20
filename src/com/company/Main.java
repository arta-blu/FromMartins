package com.company;

import java.util.*;

import static com.company.Sweet.*;

public class Main {

    public static void main(String[] args) {

        String str = "\u2606"; //star unicode

        System.out.println("                      "+ str+str+str);

        Recipe recipe1 = new Recipe("Couscous", new String[]{"100 g couscous", "200ml hot low salt vegetable stock",
                "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"},
                "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve", 10, new double[]{1,2,5});

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
                " Continue with the remaining beetroots. Let cool and transfer to a serving plate.\n", 40,new double[]{4,4,5});

        Recipe recipe3 = new Recipe("Caprese salad or tomatoes with mozzarella", new String[]{"3 mozzarella cheese balls",
                "3 tomatoes", "1 handful of fresh basil leaves", "Olive oil", "1 tbsp. balsamic (if desired)", "salt", "pepper "},
                "Tip: Mozzarella and tomato ratio 1: 1. If 2 mozzarella balls, then 2 tomatoes.\n" +
                "Cut tomatoes and mozzarella into slices, arrange on a plate alternately. Pour with olive oil and balsamic " +
                "vinegar, add a little salt, pepper, and decorate with basil leaves.", 5, new double[]{5,4,5});

        Recipe recipe4 = new Recipe("Chocolate chia pudding", new String[]{"60g chia seeds", "400ml unsweetened almond " +
                "milk or hazelnut milk", "3 tbsp cacao powder", "2 tbsp maple syrup", "½ tsp vanilla extract", "cacao nibs , " +
                "mixed", "frozen berries"}, "Put all the ingredients in a large bowl with a generous pinch of sea salt " +
                "and whisk to combine. Cover with cling film then leave to thicken in the fridge for at least 4 hours, or overnight. " +
                "Spoon the pudding into four glasses, then top with the frozen berries and cacao nibs.\n",
                245, new double[]{4,3,5});

        Recipe recipe5 = new Recipe("Vegan tomato soup", new String[]{"2 tablespoons olive oil", "1 onion", "4 cloves garlic",
                " 4 tomatoes","3 cups cherry tomatoes", " ¾ cup vegetable broth", "2 bay leaves", "2 sprigs fresh basil"},
                "Heat olive oil in a pot over low heat and cook onion until soft and translucent. " +
                "Add garlic and cook until fragrant, about 1 minute. Increase heat to medium, add all tomatoes, " +
                "and cook until they start to break down, about 5 minutes. Stir occasionally. Add vegetable broth, bay leaves, and 1 sprig of basil." +
                " Bring to a boil, reduce heat, and simmer until tomatoes have broken down and soup starts to thicken, about 30 minute.\n" +
                "Remove soup from heat and cool slightly. Remove bay leaves and basil.\n" +
                "Puree tomato soup with an immersion blender until smooth.", 65, new double[]{2,3,3,5});

        Recipe recipe6 = new Recipe("Chicken fillets with red pepper", new String[]{"4 skinless and boneless chicken fillets",
                "salt, spice mixture of your choice","1 red sweet pepper", " garlic clove", "a small bunch of parsley greens", "2 tbs of olive oil"},
                "Chicken fillets rubbed with a mixture of salt and spices, arranged in a mold. Blend sliced peppers with parsley and garlic," +
                        " add olive oil. Spread the fillets with the resulting mixture, pour a little water into the mold," +
                        " bake in the oven at 200 degrees for about 25 minutes. To make the chicken breast a little juicier," +
                        " you can pour a little sour cream on it. Serve with pasta or potatoes and fresh vegetable salad.\n" ,
                30, new double[]{5,4,5,5});

        Recipe recipe7= new Recipe("Curd cream with canned peach puree", new String[]{"200 ml cream", "400 g skimmed milk curd",
                "4 tbsp Sugar","400 g canned peaches","to taste Cinnamon"},
                "Pour sugar through the mesh of the mashed cottage cheese and stir until the sugar has melted." +
                        " Whipped cream in the wily foam and mixed into sweet curd. " +
                        "Canned peaches are blended in a homogeneous mass, adding a pinch of cinnamon at will. " +
                        "Put in dessert dishes, rounds of cream and peach puree." ,
                20, new double[]{3,5,4,4});

        Recipe recipe8= new Recipe("Muffins", new String[]{"1,5 cups all-purpose flour, 1/2 cup sugar", "2 teaspoons baking powder",
                " 1/2 teaspoon salt, 1 large egg", "1/2 cup milk", "1/4 cup vegetable oil"},
                "Stir together first 4 ingredients in a large bowl; make a well in center of mixture.\n" +
                        "Stir together egg, milk, and oil until blended. Add to dry ingredients, stirring just until\n" +
                        "moistened. Spoon batter into lightly greased muffin pans, filling two-thirds full.\n" +
                        "Bake at 400° for 18 to 20 minutes. Remove from pans immediately\n" ,
                35, new double[]{2,2,4});






        ArrayList<Recipe> allRecipe = new ArrayList<Recipe>();

        allRecipe.add(recipe1);
        allRecipe.add(recipe2);
        allRecipe.add(recipe3);
        allRecipe.add(recipe4);
        allRecipe.add(recipe5);
        allRecipe.add(recipe6);
        allRecipe.add(recipe7);
        allRecipe.add(recipe8);


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


        System.out.print("Hello! \u263a Welcome to COOK BOOK! Enjoy Your experience! \u2615");
        Scanner input = new Scanner(System.in);

        instructions();

        boolean quit = false;

        while (!quit) {
            System.out.print("Please select Your choice from 0 to 5: ");
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
                    AddFavorite.addToFavorite(allRecipe);
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
            Recipe recipeFromUser = new Recipe(null, null, null, 0,null);
            recipeFromUser.recipeInput();

            System.out.println("Do you want to add calories? (1 - yes, 0 - no)");
            int answerCalories = input.nextInt();
            if (answerCalories == 1) {
                Sweet.addCalories();
            } else if (answerCalories == 0) {
                System.out.println("No calories added");
            } else {
                System.out.println("wrong answer");      // WHILE!!!!
            }

            recipeFromUser.printUserRecipe();

            System.out.println("is it correct? (1 - yes, 0 - no)");
            int correct;
            while(true) {
                correct = input.nextInt();
                if (correct != 1 && correct != 0) {
                    recipeFromUser.printUserRecipe();
                    System.out.println("is it correct? (1 - yes, 0 - no)");
                } else if (correct == 0) {
                    System.out.println("Let's make changes in recipe");
                    recipeFromUser.changeRecipe();
                    System.out.println("Do you want to make other changes? (1 - no, 0 - yes)");
                } else {
                    System.out.println("Your recipe is  submitted: ");
                    recipeFromUser.printUserRecipe();
                    break;
                }
            }


        }else if (answer.equalsIgnoreCase("healthy")){
            Recipe recipeFromUser = new Recipe(null, null, null, 0,null);
            recipeFromUser.recipeInput();

            Healthy.isRecipeVegan();
            recipeFromUser.printUserRecipe();

            System.out.println("is it correct? (1 - yes, 0 - no)");
            int correct;
            while(true) {
                correct = input.nextInt();
                if (correct != 1 && correct != 0) {
                    recipeFromUser.printUserRecipe();
                    System.out.println("is it correct? (1 - yes, 0 - no)");
                } else if (correct == 0) {
                    System.out.println("Let's make changes in recipe");
                    recipeFromUser.changeRecipe();
                    System.out.println("Do you want to make other changes? (1 - no, 0 - yes)");
                } else {
                    System.out.println("Your recipe is  submitted: ");
                    recipeFromUser.printUserRecipe();
                    break;
                }
            }
        }else {
            System.out.println("Please try again!");
        }

    }



    private static void instructions() {
            System.out.println("\nPress " + "\u21d3"); //☟
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To search for recipes.");
            System.out.println("\t 2 - To add Your recipe.");
            System.out.println("\t 3 - To vote for recipe.");
            System.out.println("\t 4 - To add to favorites.");
            System.out.println("\t 5 - To quit the application.");
    }
}

