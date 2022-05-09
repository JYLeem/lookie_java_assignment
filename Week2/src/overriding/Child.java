package overriding;



public class Child extends Parent {

    String lastName;

    public Child(String firstName, String lastName) {
        super(firstName);
        this.lastName = lastName;
    }

    @Override
    public void sayLastName() {
        System.out.println(this.lastName);
    }


    /*
    오버라이딩 예시
     */

    @Override
    public String toString() {
        return "Child{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Child obj1 = (Child) obj;
        return this.lastName== obj1.lastName && this.firstName==obj1.firstName;
    }

    public static void main(String[] args) {
        Child child = new Child("kim","dd");
        child.sayFullName();

        System.out.println(child);


        Child child1 = new Child("kim","dd");
        Child child2 = new Child("kim","dd");

        System.out.println(child1==child2);
        System.out.println(child1.equals(child2));
    }
}
