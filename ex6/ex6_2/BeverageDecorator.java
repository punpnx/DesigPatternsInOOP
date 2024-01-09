public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public int getCost() {
        return beverage.getCost();
    }

    public String getDescription() {
        return beverage.getDescription();
    }
}