package interfaceandabstract.exabstract;

public abstract class AbstractStore {
    protected int amount;

    public AbstractStore(int amount){
        this.amount=amount;
    }

    public abstract void order();
}
