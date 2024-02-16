public class Alarm {
    private Mediator mediator;

    public Alarm(Mediator mediator) {
        this.mediator = mediator;
    }

    public void doAlarm() {
        System.out.println("Alarm is sending event to all...");
        mediator.notify(null); // Notify the mediator
    }
}
