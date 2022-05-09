package interfaceandabstract.strategy;

public class EnglishPrinter implements Printer{
    @Override
    public void execute() {
        System.out.println("영어 프린터.");
    }
}
