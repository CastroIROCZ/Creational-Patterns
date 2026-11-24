public class PizzaDriver {
    public static void main(String[] args) {
        //PizzaHut
        
        Pizza pizza4 = new Pizza.Builder("Pizza Hut", "Large")
                .addToppings("Pepperoni")
                .addToppings("Bacon")
                .addToppings("Extra Cheese")
                .build();

        //Small pizza with 2 toppings
        Pizza pizza5 = new Pizza.Builder("Pizza Hut", "Small")
                .addToppings("Chicken")
                .addToppings("Pesto")
                .build();


        //Little Caesars

        //Medium pizza with 8 toppings
        Pizza pizza6 = new Pizza.Builder("Little Caesars", "Medium")
                .addToppings("Pepperoni")
                .addToppings("Sausage")
                .addToppings("Mushrooms")
                .addToppings("Bacon")
                .addToppings("Onions")
                .addToppings("Peppers")
                .addToppings("Olives")
                .addToppings("Extra Cheese")
                .build();

        //Small pizza with 6 toppings
        Pizza pizza7 = new Pizza.Builder("Little Caesars", "Small")
                .addToppings("Ham")
                .addToppings("Pesto")
                .addToppings("Chicken")
                .addToppings("Spinach")
                .addToppings("Beef")
                .addToppings("Extra Cheese")
                .build();


        //Dominos

        //Small pizza with 1 topping
        Pizza pizza8 = new Pizza.Builder("Dominos", "Small")
                .addToppings("Pepperoni")
                .build();

        //Large pizza with 3 toppings
        Pizza pizza9 = new Pizza.Builder("Dominos", "Large")
                .addToppings("Spicy Pork")
                .addToppings("Ham and Pineapple")
                .addToppings("Extra Cheese")
                .build();


        //Eat all six pizzas
        pizza4.eat();
        pizza5.eat();
        pizza6.eat();
        pizza7.eat();
        pizza8.eat();
        pizza9.eat();
    }
}