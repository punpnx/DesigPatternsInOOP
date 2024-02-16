public class Game {
    private GameBehavior gameBehavior;

    public Game(GameBehavior gameBehavior) {
        this.gameBehavior = gameBehavior;
    }

    public void setGameBehavior(GameBehavior gameBehavior) {
        this.gameBehavior = gameBehavior;
    }

    public void playGame() {
        gameBehavior.initializeGame();
        gameBehavior.playingGame();
        gameBehavior.showResult();
    }
}