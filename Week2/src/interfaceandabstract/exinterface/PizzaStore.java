package interfaceandabstract.exinterface;

public class PizzaStore implements InterfaceStore {


    @Override
    public void order() {
        System.out.println("accept pizza order");
    }

    @Override
    public void prepare() {
        System.out.println("피자 준비중");
        InterfaceStore.hi();
    }
}
