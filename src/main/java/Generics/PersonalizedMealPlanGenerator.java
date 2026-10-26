
/*
 * This program demonstrates a personalized meal plan using Java Generics.
 * It stores different meal types and displays them using a common interface.
 */

package Generics;

import java.util.ArrayList;
import java.util.List;

// Defines a common method that every meal type must implement.
interface MealPlan {
    public void displayMeal();
}

class VegetarianMean implements MealPlan {
    String name;
    String type;

    VegetarianMean(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayMeal() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }

}

class Vegan implements MealPlan {
    String name;
    String type;

    Vegan(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayMeal() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
    }
}

// Stores meals of types that implement the MealPlan interface.
class Meal<T extends MealPlan> {
    List<T> meals;

    Meal() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(T meal) {
        meals.add(meal);
    }
}

class DisplayMeals {
    // The wildcard allows meals of different types that implement MealPlan.
    public void Meals(List<? extends MealPlan> meals) {
        for (MealPlan meal : meals) {
            meal.displayMeal();
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        // Create a meal collection and add different meal options.
        Meal<MealPlan> meal = new Meal<>();
        meal.addMeal(new VegetarianMean("dosa", "vegetarian"));
        meal.addMeal(new Vegan("fish", "Non veg"));

        // Display the details of every meal in the collection.
        DisplayMeals displayMeals = new DisplayMeals();
        displayMeals.Meals(meal.meals);
    }
}
