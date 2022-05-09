import java.util.Random;

public class HangManExecutor implements  HangManExecutors{

    private static final String NOW_STATUS_PREFIX ="현재의 상태는";
    private static final String NOW_STATUS_SUFFIX =" 입니다. ";

    private HangManExecutor(){}

    private static HangManExecutor INSTANCE = new HangManExecutor();

    public static HangManExecutor getInstance(){
        return INSTANCE;
    }

    public String makeRandom(String[] hangManWordList){
        Random random = new Random();
        String problemWord = hangManWordList[random.nextInt(3)];
        userTry(problemWord, null);
        return problemWord;
    }

    public boolean userTry(String problemWord, String userAnswer){
        if (checkCurrentAnswer(problemWord, userAnswer)) {
            return false;
        }
        String status = checkInitOrUserAnswer(problemWord, userAnswer);
        System.out.println(status);
        return true;
    }

    private boolean checkCurrentAnswer(String problemWord, String userAnswer) {
        if(problemWord.equals(userAnswer)){
            return true;
        }
        return false;
    }

    private static String checkInitOrUserAnswer(String problemWord, String userAnswer){
        if(userAnswer==null){
            return makeInitStatus(problemWord);
        }
        else {
            return makePlayingGameStatus(problemWord, userAnswer);
        }
    }

    private static String makeInitStatus(String problemWord){
        StringBuilder sb = new StringBuilder();
        sb.append(NOW_STATUS_PREFIX);
        for(int i=0; i<problemWord.length(); i++){
            sb.append(" _");
        }
        sb.append(NOW_STATUS_SUFFIX);
        return sb.toString();
    }
    private static String makePlayingGameStatus(String problemWord, String userAnswer){
        StringBuilder sb= new StringBuilder();
        sb.append(NOW_STATUS_PREFIX);
        for(int i=0; i<problemWord.length(); i++){
            sb.append(checkSpell(problemWord.charAt(i), userAnswer.charAt(i)));
        }
        sb.append(NOW_STATUS_SUFFIX);
        return sb.toString();

    }

    private static String checkSpell(char problemWordChar, char userAnswerChar){
        if(problemWordChar!=userAnswerChar){
            return " _";
        }
        else{
            return " "+problemWordChar;
        }
    }
}
