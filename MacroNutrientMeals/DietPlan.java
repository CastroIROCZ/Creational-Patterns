public enum DietPlan {
    NO_RESTRICTION("No Restriction"),
    PALEO("Paleo"),
    VEGAN("Vegan"),
    NUT_ALLERGY("Nut Allergy");

    private String name;

    private DietPlan(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}
