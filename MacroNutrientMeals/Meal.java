public class Meal {
    private Customer customer;
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Meal(Customer customer, Carbs carbs, Protein protein, Fats fats) {
        this.customer = customer;
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void printMeal() {
        System.out.println("Customer: " + customer.getCustomerName());
        System.out.println("Diet Plan: " + customer.getDietPlan());
        System.out.println("Carbs: " + carbs.getFoodName());
        System.out.println("Protein: " + protein.getFoodName());
        System.out.println("Fats: " + fats.getFoodName());
        System.out.println();
    }
}
