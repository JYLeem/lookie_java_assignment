package interfaceandabstract.strategy;

public class KoreanPrinter implements Printer{
    @Override
    public void execute() {
        System.out.println("한국어 프린터.");
    }
}
