package starttoParameter;


class Duck{
    /*
    필드
     */
    int age;
    int height;
    final String NAME = "LOOKIE_DUCK";
    BodyOrgan bodyOrgan;

    /*
    생성자
     */
    public Duck(int age, BodyOrgan bodyOrgan){
        this.age=age;
        this.bodyOrgan=bodyOrgan;
    }

    /*
    메서드
     */
    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return this.age;
    }
}
class BodyOrgan{
    String foot;
    String wing;

    public BodyOrgan(String foot, String wing) {
        this.foot = foot;
        this.wing = wing;
    }

    public String getFoot(){
        return this.foot;
    }

    public void setFoot(String foot){
        this.foot=foot;
    }
}

public class StartToReferenceParameter{
    public static void main(String[] args) {

        Duck[] ducks = new Duck[10];
        ducks[5] = new Duck(10,new BodyOrgan("h1","h2"));
        int sixthDuckAge = ducks[5].getAge();

        // primitive 자료형은 기본형 매개변수
        int a = 10;

        // 객체는 참조형 매개변수
        BodyOrgan bodyOrgan = new BodyOrgan("h1", "h2");

        System.out.println(bodyOrgan.getFoot());
        change(a, bodyOrgan);
        System.out.println(a+" "+bodyOrgan.getFoot());

    }

    private static void change(int a,BodyOrgan bodyOrgan) {
        a=11;
        bodyOrgan.setFoot("h2");
    }
}