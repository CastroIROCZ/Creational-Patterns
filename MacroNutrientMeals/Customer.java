public class Customer {
    private String customerName;
    private DietPlan dietPlan;

    public Customer(String customerName, DietPlan dietPlan) {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name is required.");
        }

        if (dietPlan == null) {
            throw new IllegalArgumentException("Diet plan is required.");
        }

        this.customerName = customerName;
        this.dietPlan = dietPlan;
    }

    public String getCustomerName() {
        return customerName;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }
}
