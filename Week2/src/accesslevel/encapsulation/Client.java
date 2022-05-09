package accesslevel.encapsulation;

import accesslevel.AccessLevelCheck;

public class Client {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        carFactory.createCar();
    }
}
