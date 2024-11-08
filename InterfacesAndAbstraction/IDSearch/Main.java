package InterfacesAndAbstraction.IDSearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Identifiable> passed = new LinkedList<>();

        while (!input.equals("End")) {
            String info[] = input.split("\\s+");

            passed.add(info.length==2? new Robot(info[0],info[1]) : new Citizen(info[0],Integer.parseInt(info[1]),info[2]));

            input = scanner.nextLine();
        }

        String blackListLastThreeDigits = scanner.nextLine();

        for (Identifiable s : passed) {
            if (s.getId().endsWith(blackListLastThreeDigits))
                System.out.println(s.getId());
        }
    }
}
