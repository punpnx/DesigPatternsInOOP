public class MilkDecorator extends BeverageDecorator {

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost() + 6;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "milk ";
    }
}
