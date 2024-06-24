package Encapsulation.Teams;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public void setFirstName(String firstName) {
        if(firstName.length()>=3)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException("Name is too short.");
    }

    public void setLastName(String lastName) {
        if(lastName.length()>=3)
            this.lastName = lastName;
        else
            throw new IllegalArgumentException("Name is too short.");
    }

    public void setAge(int age) {
        if(age>0&&age<110)
            this.age = age;
        else
            throw new IllegalArgumentException("Invalid age.");
    }

    public int getAge() {
        return age;
    }
}
