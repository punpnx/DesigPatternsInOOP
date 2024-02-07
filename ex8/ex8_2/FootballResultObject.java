interface FootballResultObject {
    void registerSubscriber(Subscriber o);
    void removeSubscriber(Subscriber o);
    void notifySubscriber(String score);
}