package Enums.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];

        int multiplier = switch (season) {
          case "Autumn" -> 1;
          case "Spring" -> 2;
          case "Winter" -> 3;
          case "Summer" -> 4;
          default -> throw new IllegalArgumentException("No such season " + season);
        };

        double discount = switch (discountType) {
          case "VIP" -> 0.2;
          case "SecondVisit" -> 0.1;
          default -> 0;
        };

        double totalPrice = pricePerDay * days * multiplier * (1-discount);
        System.out.printf("%.2f", totalPrice);
    }
}
