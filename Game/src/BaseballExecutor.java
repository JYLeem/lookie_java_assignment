import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class BaseballExecutor implements BaseballExecutors{


    private BaseballExecutor(){}

    private static final BaseballExecutor INSTANCE = new BaseballExecutor();

    public static BaseballExecutor getInstance(){
        return INSTANCE;
    }

    public String makeRandom() {
        StringBuilder sb = new StringBuilder();
        getNumber(sb);
        return sb.toString();
    }

    public boolean userTry(String computerMakeNumber,String userAnswer){
        if(checkCurrentAnswer(computerMakeNumber, userAnswer)){
            return false;
        }
        int strike =0;
        int ball = 0;

        strike = countStrike(computerMakeNumber, userAnswer);
        ball = countBall(computerMakeNumber, userAnswer);

        System.out.println(strike+"strike "+ ball+" ball 입니다. ");
        return true;
    }

    private static void getNumber(StringBuilder sb) {
        Random rand = new Random();
        boolean flag = true;
        HashSet<Integer> hashSet = new HashSet<>();
        while (flag) {
            int tempNumber = rand.nextInt(10);
            hashSet.add(tempNumber);
            flag = decideContinue(hashSet);
        }

        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext()){
            sb.append(iterator.next());
        }
        checkZero(sb);
    }

    private static boolean decideContinue(HashSet<Integer> set) {
        if(set.size()<3){
            return true;
        }
        else{
            return false;
        }
    }

    private static void checkZero(StringBuilder sb){
        if(sb.charAt(0)=='0'){
            sb.reverse();
        }
    }

    private static boolean checkCurrentAnswer(String computerMakeNumber, String userAnswer){
        if(computerMakeNumber.equals(userAnswer)){
            return true;
        }
        else{
            return false;
        }
    }

    private static int countStrike(String computerMakeNumber, String userAnswer){
        Integer count = 0;
        for(int i=0; i<3; i++){
            count+=checkStrike(computerMakeNumber.charAt(i), userAnswer.charAt(i));
        }
        return count;
    }

    private static int checkStrike(char computerChar, char userChar){
        if(computerChar==userChar){
            return 1;
        }
        else{
            return 0;
        }
    }

    private static int countBall(String computerMakeNumber, String userAnswer){
        Integer count = 0;
        for(int i=0; i<3; i++){
            count += checkBall(computerMakeNumber, userAnswer.charAt(i),i);
        }

        return count;
    }

    private static int checkBall(String computerMakeNumber, char userChar, int index){
        int computerInputIndex = computerMakeNumber.indexOf(String.valueOf(userChar));
        if(computerInputIndex!=index && computerInputIndex!=-1){
            return 1;
        }
        else{
            return 0;
        }
    }
}
