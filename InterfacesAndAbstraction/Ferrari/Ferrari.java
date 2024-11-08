package InterfacesAndAbstraction.Ferrari;

public class Ferrari implements Car{
    private String driverName;
    private static final String MODEL = "488-Spider";

    public Ferrari(String driverName) {
        this.driverName = driverName;
        System.out.println(this.toString());
    }

    @Override
    public String brakes() {
        return "Brakes!";
    }

    @Override
    public String gas() {
        return "brum-brum-brr";
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s",MODEL,brakes(),gas(),this.driverName);
    }
}
