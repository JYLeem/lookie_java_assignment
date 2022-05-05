import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class NumBaseball extends Game {
    private static final String START_BASEBALL = "숫자야구를 시작합니다.";
    private static final String CHOICE_NUM = "생각하시는 3자리 숫자를 입력해주세요.";

    @Override
    public void play() throws IOException {
        boolean flag = true;
        initPrint();
        String Answer = setAnswer();
        System.out.println(Answer);
        while (flag) {
            String SetNum = input();
            flag = checkAnswer(Answer, SetNum);
        }
    }


    private String setAnswer() {
        Random rand = new Random();
        //0~9까지 랜덤 정수 3개생성
        int randNum1 = rand.nextInt(10);
        int randNum2 = rand.nextInt(10);
        int randNum3 = rand.nextInt(10);

        HashSet<Integer> set = new HashSet<>();
        set.add(randNum1);
        set.add(randNum2);
        set.add(randNum3);
        //만약 중복이있다면 size가 3보다 작으니 size가 3될때까지 생성
        while (set.size() < 3) {
            int randNum = rand.nextInt(10);
            set.add(randNum);
        }
        //3개의 정수를 하나로 합침
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = String.valueOf(iterator.next());
            sb.append(str);
        }
        //만약 맨앞자리가 0이라면 0을 맨뒤로 보냄
        String result = sb.toString();
        if (result.startsWith("0")) {
            String a = result.substring(1);
            a += "0";
            result = a;
        }
        return result;
    }

    private String input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().trim();
    }

    private void initPrint() {
        System.out.println(START_BASEBALL);
        System.out.println(CHOICE_NUM);
    }

    private boolean checkAnswer(String Answer, String SetNum) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            int[] check = checkSB(i, Answer, SetNum, strike, ball);
            strike=check[0];
            ball=check[1];
        }
        System.out.println(strike + "strike " + ball + "ball 입니다.");
        if (strike < 3) {
            return true;
        } else {
            return false;
        }
    }

    private int[] checkSB(int i, String Answer, String SetNum, int strike, int ball) {
        int[] result= new int[2];
        if (Answer.charAt(i) == SetNum.charAt(i)) {
            strike++;
        }
        else {
            ball=checkBall(i,SetNum,Answer,ball);
        }
        result[0]=strike;
        result[1]=ball;
        return result;
    }
    private int checkBall(int i,String SetNum,String Answer,int ball){
        if (SetNum.indexOf(Answer.charAt(i)) != -1) {
            return ball+1;
        }
        return ball;
    }
}
