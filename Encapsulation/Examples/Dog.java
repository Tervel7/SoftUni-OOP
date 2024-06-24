package Encapsulation.Examples;

public class Dog extends Animal{

    Dog(int height, int weight) {
        super(height, weight);
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
