package com.company;

import java.util.Arrays;

public class DefaultRecipes {

    public static String couscousSalad() {
        String name = "Couscous salad";
        String[] ingredients1 = new String[]{"100 g couscous", "200ml hot low salt vegetable stock",
                "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"};
        String description = "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve";
        int cookingTime = 10;

        return "Recipe name: " + name + ".\n" +
                "Ingredients: " + Arrays.toString(ingredients1) + ".\n"
                + "Instructions " + description + ".\n" + "Cooking time: " + cookingTime + " min.";
    }

    public static String chocolateChiaPudding() {
        String name2 = "Chocolate chia pudding";
        String[] ingredients2 = new String[]{"60g chia seeds", "400ml unsweetened almond milk or hazelnut milk",
                "3 tbsp cacao powder", "2 tbsp maple syrup", "½ tsp vanilla extract", "cacao nibs , mixed", "frozen berries"};
        String description2 = "Put all the ingredients in a large bowl with a generous pinch of sea salt " +
                "and whisk to combine. Cover with cling film then leave to thicken in the fridge for at least " +
                "4 hours, or overnight. Spoon the pudding into four glasses, then top with the frozen berries and cacao nibs.";
        int cookingTime2 = 245;
        int toHrs = 245 / 60;
        int remMin = cookingTime2 % 60;

        return "Recipe name: " + name2 + ".\n" +
                "Ingredients: " + Arrays.toString(ingredients2) + ".\n"
                + "Instructions " + description2 + ".\n" + "Cooking time: " + toHrs + " h and " + remMin + " min.";
    }
}
        //  Main.recipeBook.add(new Sweet(name, ingredients, description, cookingTime, category, calories));