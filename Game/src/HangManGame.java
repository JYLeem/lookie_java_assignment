import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class HangManGame implements GameFactory{

    private static final String[] HANG_MAN_WORLD_LIST = {"cat", "dog","school"};
    private static final String HANG_MAN_GAME_START_COMMENT = "행맨 게임을 시작합니다. ";
    private static final String USER_INPUT_COMMENT= "생각하시는 단어를 입력해주세요.";

    private static final String ENDING_MESSAGE_PREFIX = "정답을 맞췄습니다. 정답은 ";
    private static final String ENDING_MESSAGE_SUFFIX = " 였습니다. 게임을 종료합니다.";
    private static final HangManExecutors gameExecutor = HangManExecutors.getInstance();

    private HangManGame(){};

    private static final HangManGame INSTANCE = new HangManGame();

    public static GameFactory getInstance(){
        return INSTANCE;
    }

    @Override
    public void launch() throws IOException {
        System.out.println(HANG_MAN_GAME_START_COMMENT+"\n");
        String computerInput = gameExecutor.makeRandom(HANG_MAN_WORLD_LIST);
        boolean answerCheck = true;
        while(answerCheck){
            String userAnswer = userInput();
            answerCheck = gameExecutor.userTry(computerInput, userAnswer);
        }
        System.out.println(ENDING_MESSAGE_PREFIX+computerInput+ENDING_MESSAGE_SUFFIX);
    }

    private static String userInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(USER_INPUT_COMMENT);
        return br.readLine();
    }
}
