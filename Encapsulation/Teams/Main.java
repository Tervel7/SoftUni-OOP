package Encapsulation.Teams;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Team bulgaria = new Team("Bulgaria");

        bulgaria.addPlayer(new Person("Ivan","Ivanov",21));
        bulgaria.addPlayer(new Person("Stanislav","Petrov",23));

        System.out.println(bulgaria.getFirstTeam().size());

        bulgaria.getFirstTeam().clear();

        System.out.println(bulgaria.getFirstTeam().size());
    }
}
