import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class HangMan extends  Game{
    private static final String START_HangMan = "행맨 게임을 시작합니다.";
    private static final String[] WORD_LIST = { "cat", "dog", "school" };

    @Override
    public void play() throws IOException {
        boolean flag = true;
        initPrint();
        String result = selectWord();
        String[] words = initList(result.length());
        while(flag){
            words=checkWord(result,words);
            flag = checkResult(result,words);
        }

    }



    private boolean checkResult(String result, String[] words){
        String[] resultArr = result.split("");
        if(Arrays.equals(resultArr,words)){
            System.out.println("정답을 맞췄습니다. 정답은 "+result+" 였습니다. 게임을 종료합니다.");
            return false;
        }
        return true;
    }
    private String input() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        return br.readLine().trim();
    }
    private void initPrint(){
        System.out.println(START_HangMan);
    }
    private String[] checkWord(String result, String[] nowList) throws IOException {
        String[] resultArr = result.split("");
        int length =resultArr.length;

        nowState(nowList,length);
        System.out.println("생각하는 단어를 입력해주세요.");
        String answer = input();

        String[] yourArr = answer.split("");

        for(int i=0;i<length;i++){
            nowList[i]=isItequal(i,resultArr,yourArr);
        }
        return nowList;
    }
    private String isItequal(int i, String[] resultArr,String[] yourArr){
        if(resultArr[i].equals(yourArr[i])){
            return resultArr[i];
        }
        return "_";
    }

    private String selectWord(){
        Random rand = new Random();
        int randNumber = rand.nextInt(3);
        String result =WORD_LIST[randNumber];
        return result;
    }

    private String[] initList(int length){
        String[] cloneResult = new String[length];
        for (int i= 0;i<length;i++){
            cloneResult[i]="_";
        }
        return cloneResult;
    }

    private void nowState(String[] nowList,int length){
        System.out.print("현재상태는 ");
        for(int i=0;i<length;i++){
            System.out.print(nowList[i]+" ");
        }
        System.out.println("입니다.");
    }
}


