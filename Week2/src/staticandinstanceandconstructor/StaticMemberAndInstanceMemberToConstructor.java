package staticandinstanceandconstructor;

import accesslevel.AccessLevelCheck;

class Person {
    static int head = 1;
    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name){
        this.name=name;
    }

    public Person(){
        this("default",1);
    }

    /*
    오버로딩 change 같은 이름 함수 사용
     */

}

/*
문제
 */
class Patient{

    String name;
    boolean emergency;
    boolean normal;

    public Patient(String name, boolean emergency){
        this.name=name;
        this.emergency=emergency;
    }

    public Patient(){}
    public Patient(boolean normal, String name){
        this.name=name;
        this.normal=normal;
    }

    public static Patient createEmergencyPatient(String name, boolean emergency){
        Patient patient = new Patient();
        patient.name=name;
        patient.emergency=emergency;
        return patient;
    }
    public static Patient createNormalPatient(String name, boolean normal){
        Patient patient = new Patient();
        patient.name=name;
        patient.normal=normal;
        return patient;
    }
}

class StaticMemberAndInstanceMember{

    public static void main(String[] args) {
        int head = Person.head;
        System.out.println(head);

        Person person = new Person("hi", 10);
        Person hi = new Person("hi");

        person.head++;


    }
}
