package Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> arr = new RandomArrayList<>();

        arr.add(4);
        arr.add(5);
        arr.add(6);

        System.out.println(arr.getRandomElement());
        System.out.println(arr);
    }
}
