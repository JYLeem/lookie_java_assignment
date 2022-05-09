package interfaceandabstract.strategy;

public class Person {

    public static void main(String[] args) {
        Company company = new Company(new KoreanPrinter());

        company.print();

        company.setPrinter(new EnglishPrinter());

        company.print();
    }
}
