package assignments.feb1.assignment1.methodreference;

public class Person {

    private final Integer age;
    private final String name;

    public Person(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
