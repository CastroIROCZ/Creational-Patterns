import java.util.ArrayList;
import java.util.Random;

public class CarbsFactory {
    private static final CarbsFactory instance = new CarbsFactory();
    private Random random;

    private CarbsFactory() {
        this.random = new Random();
    }

    public static CarbsFactory getInstance() {
        return instance;
    }

    public Carbs createCarbs(DietPlan dietPlan) {
        if (dietPlan == null) {
            throw new IllegalArgumentException("Diet plan is required.");
        }

        ArrayList<String> options = new ArrayList<>();
        options.add("Cheese");
        options.add("Bread");
        options.add("Lentils");
        options.add("Pistachio");

        if (dietPlan == DietPlan.PALEO) {
            //paleo only allows pistachio from the carbs list
            options.clear();
            options.add("Pistachio");
        } else if (dietPlan == DietPlan.VEGAN) {
            //vegans cannot have dairy
            options.remove("Cheese");
        } else if (dietPlan == DietPlan.NUT_ALLERGY) {
            //remove pistachio for customers with nut allergies
            options.remove("Pistachio");
        }

        String food = options.get(random.nextInt(options.size()));
        return new Carbs(food);
    }
}
