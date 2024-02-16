public class CoffeePot implements Device {
    private Mediator mediator;

    public CoffeePot(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Coffee Pot";
    }

    @Override
    public void doTask() {
        System.out.println("I am coffee pot,... doing my task");
        mediator.notify(this);
    }
}