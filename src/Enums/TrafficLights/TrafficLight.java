package Enums.TrafficLights;

public class TrafficLight {

    private Color color;

    TrafficLight(String color) {
        this.color = Color.valueOf(color);
    }

    public void changeColor() {
        if(this.color.equals(Color.RED))
            this.color = Color.GREEN;
        else if(this.color.equals(Color.YELLOW))
            this.color = Color.RED;
        else if(this.color.equals(Color.GREEN))
            this.color = Color.YELLOW;
    }

    public void printColor() {
        System.out.print(this.color + " ");
    }
}
