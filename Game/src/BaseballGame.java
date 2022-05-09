import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaseballGame implements GameFactory {

    private static final String BASEBALL_GAME_START_COMMENT = "숫자야구 게임을 시작합니다. ";
    private static final String USER_INPUT_COMMENT = "생각하시는 3자리 숫자를 입력해주세요.";
    private static final String ENDING_MESSAGE_PREFIX = "정답을 맞췄습니다. 정답은 ";
    private static final String ENDING_MESSAGE_SUFFIX = " 였습니다. 게임을 종료합니다.";


    private static final BaseballExecutors gameExecutor = BaseballExecutors.getExecutor();

    private BaseballGame(){};

    private static final BaseballGame INSTANCE = new BaseballGame();

    public static GameFactory getInstance(){
        return INSTANCE;
    }

    @Override
    public void launch() throws IOException {
        System.out.println(BASEBALL_GAME_START_COMMENT);
        String computerInput = gameExecutor.makeRandom();
        boolean flag = true;
        while (flag) {
            String userAnswer = userInput();
            flag = gameExecutor.userTry(computerInput, userAnswer);
        }
        System.out.println(ENDING_MESSAGE_PREFIX+computerInput+ENDING_MESSAGE_SUFFIX);
    }

    private static String userInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(USER_INPUT_COMMENT);
        return br.readLine();
    }
}
