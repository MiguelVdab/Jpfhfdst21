import be.vdab.oefeningGastenboek.Gastenboek;
import be.vdab.oefeningGastenboek.GastenboekEntry;
import be.vdab.oefeningGastenboek.GastenboekManager;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GastenboekMain {
    public static void main(String[] args) {
        var manager = new GastenboekManager();
        var gastenboek = manager.lees();
        var scanner = new Scanner(System.in);
        System.out.println("T=tonen , S=Schrijven, E=einde:");
        for (String keuze; !(keuze = scanner.nextLine()).equalsIgnoreCase("E"); ) {
            switch (keuze) {
                case "T", "t" -> System.out.println(gastenboek);
                case "S", "s" -> {
                    System.out.println("Schrijver:");
                    var schrijver = scanner.nextLine();
                    System.out.println("Boodschap:");
                    var boodschap = scanner.nextLine();
                    gastenboek.toevoegen(new GastenboekEntry(schrijver, boodschap));
                    manager.schrijf(gastenboek);
                }
                default -> System.out.println("Verkeerde keuze");
            }
            System.out.println("T=tonen , S=Schrijven, E=einde:");
        }
    }
}

