package Enums.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        String season = input[2];
        String discountType = input[3];

        int multiplier = Season.getSeasonFromString(season).getMultiplier();
        double discount = Discount.getDiscountFromString(discountType).getDiscountPercent();

        System.out.println(Calculate.total(pricePerDay,days,multiplier,discount));
    }
}
