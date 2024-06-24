package Enums.Calculator;

public enum Discount {
    VIP(0.2),
    SECOND_VISIT(0.1),
    NONE(0);

    private double discountPercent;

    Discount(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountPercent() {
        return this.discountPercent;
    }

    public static Discount getDiscountFromString(String discount) {
        return switch (discount) {
            case "VIP" -> VIP;
            case "SecondVisit" -> SECOND_VISIT;
            default -> NONE;
        };
    }
}
