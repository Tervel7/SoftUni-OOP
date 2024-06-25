package Inheritance.PersonExample;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan",20);
        Person employee1 = new Employee("Stanislav",25,"SoftUni");
        Employee employee2 = new Employee("Ivailo", 27,"Pashov Audit Group");

        System.out.println(person.getInfo());
        System.out.println(employee1.getInfo());
        System.out.println(employee2.getInfo());
    }
}
