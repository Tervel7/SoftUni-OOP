package InterfacesAndAbstraction.CarShop;

public class CarImpl implements Car{

    private final String model;
    private final String color;
    private final int horsePower;
    private final String countryProduced;

    CarImpl(String model, String color, int horsePower, String countryProduced){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.countryProduced = countryProduced;
    }
    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String countryProduced() {
        return countryProduced;
    }
}
