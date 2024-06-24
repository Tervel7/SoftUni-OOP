package Enums.Calculator;

public enum Season {
    AUTUMN(1),
    SPRING(2),
    WINTER(3),
    SUMMER(4);

    private int multiplier;

    Season(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return this.multiplier;
    }

    public static Season getSeasonFromString(String season) {
        return switch (season) {
          case "Autumn" -> AUTUMN;
          case "Spring" -> SPRING;
          case "Winter" -> WINTER;
          case "Summer" -> SUMMER;
            default -> throw new IllegalArgumentException("Not such season: " + season);
        };
    }
}
