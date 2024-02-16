// Template Method design pattern
public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        football.playGame();

        Game basketball = new Basketball();
        basketball.playGame();
    }
}
