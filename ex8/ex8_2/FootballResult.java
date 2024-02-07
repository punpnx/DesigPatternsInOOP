import java.util.*;

class FootballResult implements FootballResultObject {
    private List<Subscriber> subscribers = new ArrayList<>();

    @Override
    public void registerSubscriber(Subscriber o) {
        subscribers.add(o);
    }

    @Override
    public void removeSubscriber(Subscriber o) {
        subscribers.remove(o);
    }

    @Override
    public void notifySubscriber(String score) {
        for (Subscriber subscriber : subscribers) {
            subscriber.updateScore(score);
        }
    }
}