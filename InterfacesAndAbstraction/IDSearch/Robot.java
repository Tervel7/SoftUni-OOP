package InterfacesAndAbstraction.IDSearch;

public class Robot implements Identifiable{
    private String id;
    private String model;

    public Robot(String model, String id) {
        this.id = id;
        this.model = model;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
