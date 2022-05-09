package interfaceandabstract.exinterface;

public class InterfaceClient {

    public static void main(String[] args) {

        InterfaceStore pizzaStore = new PizzaStore();
        InterfaceStore chickenStore = new ChickenStore();

        pizzaStore.order();
        chickenStore.order();
    }
}
