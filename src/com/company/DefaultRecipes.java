package com.company;

import java.util.Arrays;

public class DefaultRecipes {

    public String defaultRecipe() {

        String name;
        String[] ingredients;
        String description;
        int cookingTime;
        String category;
        int calories;
        boolean isVegan;

        name = "Couscous salad";
        ingredients = new String[]{"100 g couscous", "200ml hot low salt vegetable stock",
                "2 spring onions", "1 red pepper", "½ cucumber", "50 g fetta cheese", "2tbsp pesto", "2tbsp pine nuts"};
        description = "Tip the couscous into a large bowl and pour over the stock." +
                "Cover, then leave for 10 mins until fluffy and all the stock has been absorbed." +
                "Meanwhile, slice the onions and pepper, and dice the cucumber. Add these to the" +
                "couscous, fork through the pesto, crumble in the feta, then sprinkle over pine nuts" +
                "to serve";
        cookingTime = 10;
/*
        name = "";
        ingredients = new String[]{};
        description = "";
        cookingTime = 1;
*/
        return name + Arrays.toString(ingredients) + description + cookingTime;
        //  Main.recipeBook.add(new Sweet(name, ingredients, description, cookingTime, category, calories));

    }
}