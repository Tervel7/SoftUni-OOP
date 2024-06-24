package Enums.Calculator;

public class Calculate {

    public Calculate() {}

    public static double total(double pricePerDay, int days, double multiplier, double discount) {
        return pricePerDay * days * multiplier * (1-discount);
    }
}
