package InterfacesAndAbstraction.CarShop;

public class Main {
    public static void main(String[] args) {
        Car seat = new Seat("Leon","Gray",101,"Germany",12000);
        System.out.println(seat.getModel() + " " + seat.getColor());

        Seat seat2 = new Seat("Cupra","Yellow",221,"Italy",20000);
        System.out.println(seat2.getModel() + " " + seat2.getColor() + " " + seat2.getPrice());

        Car audi = new Audi("A3","Black",131,"Italy",3,130);
        Rentable audi2 = new Audi("A4","White",171,"Slovenia",3,200);

    }
}
