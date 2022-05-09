public interface BaseballExecutors {


    String makeRandom();

    boolean userTry(String computerMakeNumber,String userAnswer);
    static BaseballExecutor getExecutor(){
        return BaseballExecutor.getInstance();
    }
}
