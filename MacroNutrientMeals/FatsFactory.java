import java.util.ArrayList;
import java.util.Random;

public class FatsFactory {
    private static final FatsFactory instance = new FatsFactory();
    private Random random;

    private FatsFactory() {
        this.random = new Random();
    }

    public static FatsFactory getInstance() {
        return instance;
    }

    public Fats createFats(DietPlan dietPlan) {
        if (dietPlan == null) {
            throw new IllegalArgumentException("Diet plan is required.");
        }

        ArrayList<String> options = new ArrayList<>();
        options.add("Avocado");
        options.add("Sour cream");
        options.add("Tuna");
        options.add("Peanuts");

        if (dietPlan == DietPlan.PALEO) {
            //paleo does not allow dairy
            options.remove("Sour cream");
        } else if (dietPlan == DietPlan.VEGAN) {
            //vegans cannot have dairy or tuna
            options.remove("Sour cream");
            options.remove("Tuna");
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            //remove peanuts for customers with nut allergies
            options.remove("Peanuts");
        }

        String food = options.get(random.nextInt(options.size()));
        return new Fats(food);
    }
}
