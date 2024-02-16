// Mediator pattern
public class App {
    public static void main(String[] args) {
        Mediator mediator = new AlarmMediator();
        Sprinkler sprinkler = new Sprinkler(mediator);
        CoffeePot coffeePot = new CoffeePot(mediator);
        Alarm alarm = new Alarm(mediator);

        alarm.doAlarm();
        sprinkler.doTask();
        coffeePot.doTask();
    }
}