import java.io.IOException;

public class GameConsole {
    private static GameConsole gameConsole = new GameConsole();
    private GameConsole(){}

    public static GameConsole getInstance(){
        return Holder.instance;
    }
    private Game game;
    private static class Holder{
        private static final GameConsole instance = new GameConsole();
    }

    public void execute() throws IOException {
        game.play();
    }

    public void settingGame(int gameNumber) {
        if(gameNumber==1){
            game = new NumBaseball();
        }
        else{
            game = new HangMan();
        }
    }

}
