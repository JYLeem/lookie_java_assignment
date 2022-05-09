public interface HangManExecutors {
    String makeRandom(String [] list);

    boolean userTry(String computerMakeNumber,String userAnswer);

    static HangManExecutors getInstance(){
        return HangManExecutor.getInstance();
    }
}
