import java.io.IOException;

public class GameConsole {

    private Game game;

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
