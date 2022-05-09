package interfaceandabstract.exinterface;

public class ChickenStore implements InterfaceStore {



    @Override
    public void order() {
        prepare();
        System.out.println("accept chicken order");
    }


}
