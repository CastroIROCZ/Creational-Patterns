import java.util.ArrayList;
import java.util.Random;

public class ProteinFactory {
    private static final ProteinFactory instance = new ProteinFactory();
    private Random random;

    private ProteinFactory() {
        this.random = new Random();
    }

    public static ProteinFactory getInstance() {
        return instance;
    }

    public Protein createProtein(DietPlan dietPlan) {
        if (dietPlan == null) {
            throw new IllegalArgumentException("Diet plan is required.");
        }

        ArrayList<String> options = new ArrayList<>();
        options.add("Fish");
        options.add("Chicken");
        options.add("Beef");
        options.add("Tofu");

        if (dietPlan == DietPlan.PALEO) {
            //paleo does not allow tofu
            options.remove("Tofu");
        } else if (dietPlan == DietPlan.VEGAN) {
            //tofu is the only protein option without meat
            options.clear();
            options.add("Tofu");
        }

        String food = options.get(random.nextInt(options.size()));
        return new Protein(food);
    }
}
