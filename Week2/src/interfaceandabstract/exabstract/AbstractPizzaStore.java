package interfaceandabstract.exabstract;

public class AbstractPizzaStore extends AbstractStore{

    public AbstractPizzaStore(int amount) {
        super(amount);
    }

    @Override
    public void order() {
        System.out.println(amount+" accept pizza order");
    }
}
