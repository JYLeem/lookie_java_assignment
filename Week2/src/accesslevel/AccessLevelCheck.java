package accesslevel;

public class AccessLevelCheck {
    private int age;
    int weight;
    protected int height;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        AccessLevelCheck hi = new AccessLevelCheck();
        int age = hi.age;
        int height = hi.height;
        String name = hi.name;
        int weight = hi.weight;
    }
}
