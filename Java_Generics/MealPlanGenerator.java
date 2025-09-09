interface MealPlan {
    void describe();
}

class VegetarianMeal implements MealPlan {
    public void describe() {
        System.out.println("Vegetarian Meal Plan");
    }
}

class VeganMeal implements MealPlan {
    public void describe() {
        System.out.println("Vegan Meal Plan");
    }
}

class KetoMeal implements MealPlan {
    public void describe() {
        System.out.println("Keto Meal Plan");
    }
}

class Meal<T extends MealPlan> {
    T plan;
    public Meal(T plan) {
        this.plan = plan;
    }
    public void display() {
        plan.describe();
    }
}

class MealPlanGenerator {
    public static <T extends MealPlan> Meal<T> generateMeal(T plan) {
        return new Meal<>(plan);
    }
}