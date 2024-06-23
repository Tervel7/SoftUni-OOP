package Enums.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class JediGalaxy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] field = new int[dimensions[0]][dimensions[1]];

        int counter = 0;
        for (int i = 0; i < dimensions[0]; i++) {
            for (int j = 0; j < dimensions[1]; j++) {
                field[i][j]= counter++;
            }
        }

        int[] playerCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        playerCoordinates[0] -= 1;
        playerCoordinates[1] += 1;

        int[] evilPower = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        evilPower[0] -= 1;
        evilPower[1] -= 1;

        while(true) {
            if(evilPower[0]<dimensions[0] && evilPower[0] >=0 && evilPower[1]<dimensions[1] && evilPower[1] >=0) {
            field[evilPower[0]][evilPower[1]] = 0;
            evilPower[0] -= 1;
            evilPower[1] -= 1;
            } else
                break;
        }

        int score = 0;
        while(true) {
            if(playerCoordinates[0]<dimensions[0] && playerCoordinates[0] >=0 && playerCoordinates[1]<dimensions[1] && playerCoordinates[1] >=0) {
                score += field[playerCoordinates[0]][playerCoordinates[1]];
                playerCoordinates[0] -= 1;
                playerCoordinates[1] += 1;
            } else
                break;
        }

        System.out.println(score);
    }
}
