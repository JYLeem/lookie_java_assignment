package inheritance;

public class Parent {
    String firstName;
    public Parent(String firstName){
        this.firstName=firstName;
    }

    public void sayFirstName(){
        System.out.println(firstName);
    }
}
