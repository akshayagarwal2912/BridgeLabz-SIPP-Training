package Java_Generics;

import java.util.*;

// MealPlan interface
interface MealPlan {
    String getMealType();
}

// Subtypes
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian Meal";
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan Meal";
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto Meal";
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High-Protein Meal";
    }
}

// Generic Meal class
class Meal<T extends MealPlan> {
    private List<T> meals = new ArrayList<>();

    void addMeal(T meal) {
        meals.add(meal);
    }

    List<T> getMeals() {
        return meals;
    }
}

// Utility class with generic method
class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(Meal<T> mealPlan) {
        System.out.println("Personalized Meal Plan:");
        for (T meal : mealPlan.getMeals()) {
            System.out.println("- " + meal.getMealType());
        }
    }
}

// Main class
public class MealPlanner {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegPlan = new Meal<>();
        vegPlan.addMeal(new VegetarianMeal());
        vegPlan.addMeal(new VegetarianMeal());

        Meal<VeganMeal> veganPlan = new Meal<>();
        veganPlan.addMeal(new VeganMeal());

        Meal<KetoMeal> ketoPlan = new Meal<>();
        ketoPlan.addMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinPlan = new Meal<>();
        proteinPlan.addMeal(new HighProteinMeal());

        MealPlanGenerator.generatePlan(vegPlan);
        MealPlanGenerator.generatePlan(veganPlan);
        MealPlanGenerator.generatePlan(ketoPlan);
        MealPlanGenerator.generatePlan(proteinPlan);
    }
}
