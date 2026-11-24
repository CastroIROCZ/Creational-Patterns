public class MealDriver {
    public static void main(String[] args) {
        //create six customers using all four diet plans
        Customer[] customers = {
            new Customer("Alex", DietPlan.NO_RESTRICTION),
            new Customer("Bella", DietPlan.PALEO),
            new Customer("Carlos", DietPlan.VEGAN),
            new Customer("Diana", DietPlan.NUT_ALLERGY),
            new Customer("Ethan", DietPlan.PALEO),
            new Customer("Sofia", DietPlan.VEGAN)
        };

        //use the single macronutrient factory to access the three food factories
        AbstractMacronutrientFactory factory = MacronutrientFactory.getInstance();

        for (Customer customer : customers) {
            Carbs carbs = factory.createCarbsFactory().createCarbs(customer.getDietPlan());
            Protein protein = factory.createProteinFactory().createProtein(customer.getDietPlan());
            Fats fats = factory.createFatsFactory().createFats(customer.getDietPlan());

            Meal meal = new Meal(customer, carbs, protein, fats);
            meal.printMeal();
        }
    }
}
