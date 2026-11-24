import java.util.ArrayList;
import java.util.Set;

public class Pizza {
    private String chainName;
    private String pizzaSize;
    private ArrayList<String> toppings;

    private static final Set<String> VALID_TOPPINGS = Set.of(
    "Pepperoni",
    "Sausage",
    "Mushrooms",
    "Bacon",
    "Onions",
    "Extra Cheese",
    "Peppers",
    "Chicken",
    "Olives",
    "Spinach",
    "Tomato and Basil",
    "Beef",
    "Ham",
    "Pesto",
    "Spicy Pork",
    "Ham and Pineapple"
);

    private Pizza (Builder builder) {
        this.chainName = builder.chainName;
        this.pizzaSize = builder.pizzaSize;
        this.toppings = new ArrayList<>(builder.toppings);
    }

    public static class Builder {
        private String chainName;
        private String pizzaSize;
        private ArrayList<String> toppings;

        public Builder(String chainName, String pizzaSize) {

        if (pizzaSize == null ||
            !(pizzaSize.equalsIgnoreCase("Small") ||
            pizzaSize.equalsIgnoreCase("Medium") ||
            pizzaSize.equalsIgnoreCase("Large"))) {

            throw new IllegalArgumentException(
                "Pizza size must be Small, Medium, or Large."
            );
        }


            this.chainName = chainName;
            this.pizzaSize = pizzaSize;
            this.toppings = new ArrayList<>();
        }

        public Builder addToppings(String topping) {

            if(topping == null || !VALID_TOPPINGS.contains(topping)) {
                throw new IllegalArgumentException(
                    "Invalid topping: " + topping
                );
            }
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }

    }

    public void eat() { 
        System.out.println("Pizza Chain: " + chainName);
        System.out.println("Pizza Size: " + pizzaSize);
        System.out.println("Toppings:");

        for (String topping : toppings) {
            System.out.println(" - " + topping);
        }

    }


}