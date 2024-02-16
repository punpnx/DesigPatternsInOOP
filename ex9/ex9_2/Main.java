// Strategy design pattern
public class Main {
    public static void main(String[] args) {
        Game footballGame = new Game(new FootballBehavior());
        footballGame.playGame();

        Game basketballGame = new Game(new BasketballBehavior());
        basketballGame.playGame();
    }
}
