package inheritance;


public class Child extends Parent {
    int age;
    String lastName;

    public Child(String firstName, int age, String lastName) {
        super(firstName);
        this.age = age;
        this.lastName = lastName;
    }


    public static void main(String[] args) {
        Child child = new Child("k",10,"dm");

        Parent test1 = new Parent("1");
        Parent test2 = new Child("hi",10,"HI");

    }
}
