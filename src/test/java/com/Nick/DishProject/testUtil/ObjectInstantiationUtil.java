package com.Nick.DishProject.testUtil;

import com.Nick.DishProject.model.Category;
import com.Nick.DishProject.model.Diet;
import com.Nick.DishProject.model.Dish;
import com.Nick.DishProject.model.Ingredient;

import java.util.HashSet;
import java.util.Set;

public class ObjectInstantiationUtil {

    public static Diet createDiet(String dietName) {
        Diet diet = new Diet();
        diet.setType(dietName);
        return diet;
    }

    public static Category createCategory(String categoryName) {
        Category category = new Category();
        category.setType(categoryName);
        return category;
    }

    public static Ingredient createIngredient(String ingredientName, String ingredientType) {
        Ingredient ingredient = new Ingredient();
        ingredient.setName(ingredientName);
        ingredient.setType(ingredientType);
        return ingredient;
    }

    public static Dish createDish(Set<Diet> diets, Set<Category> categories, String dishName) {
        Dish dish = new Dish();

        if(diets == null) diets = new HashSet<>();
        if(categories == null) categories = new HashSet<>();

        dish.setDiets(diets);
        dish.setCategories(categories);
        dish.setName(dishName);
        dish.setAvgTimeToMake(10);
        dish.setCalories(100);
        dish.setDescription("Definitely something");
        dish.setWarm(true);
        dish.setCategories(categories);
        dish.setRating(10);
        dish.setImage("");
        dish.setLongDescription("Definitely definitely something");

        return dish;
    }
}
