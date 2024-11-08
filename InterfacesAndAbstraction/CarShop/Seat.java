package InterfacesAndAbstraction.CarShop;

public class Seat extends CarImpl implements Sellable{
    private int price;

    Seat(String model, String color, int horsePower, String countryProduced, int price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}
