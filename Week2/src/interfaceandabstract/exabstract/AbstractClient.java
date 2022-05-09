package interfaceandabstract.exabstract;

public class AbstractClient {
    public static void main(String[] args) {

        AbstractStore pizzaStore = new AbstractPizzaStore(10);
        AbstractStore chickenStore = new AbstractChickenStore(10);

        pizzaStore.order();
        chickenStore.order();
    }
}
