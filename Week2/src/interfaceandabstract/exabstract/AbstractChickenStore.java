package interfaceandabstract.exabstract;

import java.io.OutputStream;

public class AbstractChickenStore extends AbstractStore{


    public AbstractChickenStore(int amount) {
        super(amount);
    }

    @Override
    public void order() {
        System.out.println(amount + " accept chicken order");
    }
}
