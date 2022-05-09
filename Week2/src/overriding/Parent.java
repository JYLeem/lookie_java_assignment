package overriding;

public class Parent{
    String firstName;
    String lastName= "dm";

    public Parent(String firstName) {
        this.firstName = firstName;
    }

    public void sayFullName(){
        sayFirstName();
        sayLastName();
    }

    public void sayFirstName(){
        System.out.print(firstName+" ");
    }

    public void sayLastName(){
        System.out.println(lastName);
    }


}
