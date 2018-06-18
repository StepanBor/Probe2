package pack1;

public class ProbeFunk {

    private int age;
    private String name;

    public ProbeFunk(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public ProbeFunk() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProbeFunk{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
