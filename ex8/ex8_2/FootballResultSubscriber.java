class FootballResultSubscriber implements Subscriber {
    private String name;

    public FootballResultSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void updateScore(String score) {
        System.out.println("Live result: " + score + " (Subscriber: " + name + ")");
    }
}
