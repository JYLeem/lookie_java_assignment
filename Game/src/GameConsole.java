import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GameConsole {

    private GameFactory gameFactory;

    public GameConsole(){
    }

    public void settingGame(int gameNumber){
        gameFactory = GameFactory.getGame(gameNumber);
    }

    public void execute() throws IOException {
        gameFactory.launch();
    }
}
