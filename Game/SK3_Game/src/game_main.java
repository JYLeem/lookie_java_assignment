import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class game_main {

    private static boolean bRunnable = false;

    public static void main(String[] args) {

        run();

        for ( ; bRunnable ; run()) ;

    }

    public static void run() {


        // 게임 선택
        final int gameType = game_selection();
        System.out.println(gameType);

        // 게임 생성
        Game game = (gameType == 1) ? new BaseBallGame() : new HangmanGame();

        // 게임 시작
        game.play();

        // 재실행여부 확인
        final int replayType = input_replay();
        bRunnable = replayType == 1 ? true : false;
    }

    public static int game_selection() {
        Scanner input = new Scanner(System.in);

        System.out.println("게임을 시작합니다.");
        System.out.println("게임을 골라주세요.");
        System.out.println("1.숫자야구 2.행맨");
        String game_select = input.next();
        int game_choice = Integer.parseInt(game_select);
        return game_choice;
    }

    public static int input_replay() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.계속 0.종료");

        String i = input.next();
        return Integer.parseInt(i);
    }
}

class GameManager {
    public void start() {

        // 게임 선택
        final int gameType = game_selection();
        System.out.println(gameType);

        // 게임 생성
        Game game = (gameType == 1) ? new BaseBallGame() : new HangmanGame();

        // 게임 시작
        game.play();

        // 재실행여부 확인
        final int replayType = input_replay();
    }

    public static int game_selection() {
        Scanner input = new Scanner(System.in);

        System.out.println("게임을 시작합니다.");
        System.out.println("게임을 골라주세요.");
        System.out.println("1.숫자야구 2.행맨");
        String game_select = input.next();
        int game_choice = Integer.parseInt(game_select);
        return game_choice;
    }

    public static int input_replay() {
        Scanner input = new Scanner(System.in);
        System.out.println("1.계속 0.종료");

        String i = input.next();
        return Integer.parseInt(i);
    }
}

class Game {
    public void play() {
    }
}

class BaseBallGame extends Game {

    private ArrayList<String> userNumberList = null;
    private ArrayList<String> randomNumberList = null;

    private int strikeCount = 0;
    private int ballCount = 0;

    public void play() {
        System.out.println("BaseBallGame Start");

        input_number();
        computer_number();
        checkCount();
        checkEnd();
    }

    private void input_number() {
        Scanner input = new Scanner(System.in);

        System.out.println("생각하시는 3자리 숫자를 입력해 주세요.");
        String userNumber = input.next();
        userNumberList = new ArrayList<String>(Arrays.asList(userNumber.split("")));
    }

    private void computer_number() {
        Random rand = new Random();
        int randomNumberInt = rand.nextInt(100, 1000);
        String randomNumber = Integer.toString(randomNumberInt);
        randomNumberList = new ArrayList<String>(Arrays.asList(randomNumber.split("")));
    }

    private void checkCount() {
        System.out.println("calculateStrikeCount");
        System.out.println(userNumberList.toString());
        System.out.println(randomNumberList.toString());

        calculateCountOf(0); //
        calculateCountOf(1);
        calculateCountOf(2);

        System.out.println("Strike count: " + strikeCount);
        System.out.println("Ball count: " + ballCount);
    }

    private void calculateCountOf(int index) {
        boolean hasStrike = userNumberList.get(index) == randomNumberList.get(index);
        boolean hasBall = !hasStrike && (randomNumberList.contains(userNumberList.get(index)));

        // 삼항연산자 활용
        strikeCount = hasStrike ? strikeCount + 1 : strikeCount;
        ballCount = hasBall ? ballCount + 1 : ballCount;
    }

    private void checkEnd() {
        boolean isSuccess = strikeCount == 3;

        String successMessage = "성공 : " + randomNumberList;
        String failMessage = "";

        System.out.println(isSuccess ? successMessage : failMessage);
    }
}

class HangmanGame extends Game {
    public void play() {
        System.out.println("개발 중");
    }
}