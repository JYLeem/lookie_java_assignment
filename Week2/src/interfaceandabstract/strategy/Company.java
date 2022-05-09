package interfaceandabstract.strategy;

public class Company {

    private Printer printer;

    public Company(Printer printer) {
        this.printer = printer;
    }

    public void setPrinter(Printer printer){
        this.printer=printer;
    }

    public void print(){
        printer.execute();
    }
}
