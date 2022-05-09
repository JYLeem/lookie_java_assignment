package innerclass;

class OuterClass{

    int age = 10;
    class NonStaticNestedClass{

    }

    // 멤버 내부 클래스
    static class InnerClass{

    }

    // 로컬 내부 클래스
    public void getLocal(){
        class MemberClass{

        }
    }

    // 익명 내부 클래스
    public ExInterface getExInterface(){
        return new ExInterface(){
            @Override
            public void print() {
                System.out.println("hi");
            }
        };
    }

}

public class Person{

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        OuterClass.NonStaticNestedClass nestedClass = new OuterClass().new NonStaticNestedClass();

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        ExInterface exInterface = outerClass.getExInterface();

        exInterface.print();
    }
}
