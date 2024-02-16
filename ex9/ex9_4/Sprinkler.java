public class Sprinkler implements Device {
    private Mediator mediator;

    public Sprinkler(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "Sprinkler";
    }

    @Override
    public void doTask() {
        System.out.println("I am sprinkler,... doing my task");
        mediator.notify(this);
    }
}