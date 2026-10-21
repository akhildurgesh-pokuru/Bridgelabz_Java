package Generics;

import java.util.ArrayList;
import java.util.List;

interface MealPlan{
    public void displayMeal();
}

class VegetarianMean implements MealPlan{
    String name;
    String type;
    VegetarianMean(String name,String type){
        this.name = name;
        this.type = type;
    }

    public void displayMeal(){
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
    }

}

class Vegan implements MealPlan{
    String name;
    String type;

    Vegan(String name, String type){
        this.name = name;
        this.type = type;
    }

    public void displayMeal(){
        System.out.println("Name: "+name);
        System.out.println("Type: "+type);
    }
}


class Meal<T extends MealPlan>{
    List<T> meals;
    Meal(){
        this.meals = new ArrayList<>();
    }

    public void addMeal(T meal){
        meals.add(meal);
    }
}

class DisplayMeals{
    public void Meals(List<? extends MealPlan> meals){
        for(MealPlan meal : meals){
            meal.displayMeal();
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args){
        Meal<MealPlan> meal = new Meal<>();
        meal.addMeal(new VegetarianMean("dosa","vegetarian"));
        meal.addMeal(new Vegan("fish","Non veg"));

        DisplayMeals displayMeals = new DisplayMeals();
        displayMeals.Meals(meal.meals);
    }
}
