import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final String START_GAME = "게임기를 실행합니다.";
    private static final String CHOICE_GAME = "게임을 골라주세요. \n 1. 숫자 야구 2. 행맨";
    private static final String CHOICE_KEEP_GOING_COMMENT="게임을 게속 하시려면 1 종료를 원하시면 0 을 입력해주세요.";
    public static void main(String[] args) throws IOException {


        GameConsole console = new GameConsole();

        boolean flag = true;
        while(flag){
            initPrint();
            int gameNumber = input();
            console.settingGame(gameNumber);
            console.execute();
            askAgainGame();
            int askNumber = input();
            flag = checkNumber(askNumber);
        }
    }


    private static int input() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(br.readLine());
    }

    private static void initPrint(){
        System.out.println(START_GAME+"\n");
        System.out.println(CHOICE_GAME);
    }

    private static void askAgainGame(){
        System.out.println(CHOICE_KEEP_GOING_COMMENT);
    }

    private static boolean checkNumber(int askNumber){
        if(askNumber==0){
            return false;
        }
        else{
            return true;
        }
    }
}
