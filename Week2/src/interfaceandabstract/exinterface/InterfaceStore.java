package interfaceandabstract.exinterface;

public interface InterfaceStore {


    void order();

    // default
    default void prepare(){
        System.out.println("준비 중이다. ");
    }
    // static
    static void hi(){
        System.out.println("static");
    }
}
