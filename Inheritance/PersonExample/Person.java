package Inheritance.PersonExample;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return String.format("Hello my name is %s and I'm %d years old.", this.name, this.age);
    }
}
