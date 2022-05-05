package interfaceandabstract;

public class ChickenStore implements InterfaceStore {



    @Override
    public void order() {
        System.out.println("accept chicken order");
    }

}
