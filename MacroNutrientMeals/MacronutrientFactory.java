public class MacronutrientFactory implements AbstractMacronutrientFactory {
    private static final MacronutrientFactory instance = new MacronutrientFactory();

    private MacronutrientFactory() {
    }

    public static MacronutrientFactory getInstance() {
        return instance;
    }

    public CarbsFactory createCarbsFactory() {
        return CarbsFactory.getInstance();
    }

    public ProteinFactory createProteinFactory() {
        return ProteinFactory.getInstance();
    }

    public FatsFactory createFatsFactory() {
        return FatsFactory.getInstance();
    }
}
