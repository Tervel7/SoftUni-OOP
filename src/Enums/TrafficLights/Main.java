package Enums.TrafficLights;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] colors = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(scanner.nextLine());
        List<TrafficLight> trafficLights = new LinkedList<>();

        for (int i = 0; i < colors.length; i++) {
            trafficLights.add(new TrafficLight(colors[i]));
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < trafficLights.size(); j++) {
                trafficLights.get(j).changeColor();
                trafficLights.get(j).printColor();
            }
            System.out.println();
        }
    }
}
