import java.io.IOException;

public interface GameFactory {
    void launch() throws IOException;

    static GameFactory getGame(int num){
        if (num==1){
            return BaseballGame.getInstance();
        }
        else{
            return HangManGame.getInstance();
        }
    }
}
