package Inheritance.PersonExample;

public class Employee extends Person{
    String company;

    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public String getInfo() {
        return String.format("Hello my name is %s and I'm %d years old. I work for %s.", this.name, this.age, this.company);
    }
}
