public interface AbstractMacronutrientFactory {
    CarbsFactory createCarbsFactory();
    ProteinFactory createProteinFactory();
    FatsFactory createFatsFactory();
}
