package accesslevel.encapsulation;

public class CarFactory {

    public void createCar(){
        combineWheel();
        paintColor();
    }

    private static void combineWheel(){
        System.out.println("차의 바퀴를 부착했습니다.");
    }

    private static void paintColor(){
        System.out.println("차를 도색했습니다.");
    }
}
