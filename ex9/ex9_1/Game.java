public abstract class Game {
    // Template method
    public final void playGame() {
        initializeGame();
        playingGame();
        showResult();
    }

    protected abstract void initializeGame();
    protected abstract void playingGame();
    protected abstract void showResult();
}