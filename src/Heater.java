import java.io.IOException;
import java.util.*;

public class Heater {

    private int level;

    public void setLevel(int level) {
        this.level = level;
        System.out.println("Heizung auf Stufe: " + level + " eingestellt.");
    }

    public void selectLevel() throws RuntimeException, IOException {
        int newLevel = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bitte geben Sie eine neue Heizstufe ein (0-5): ");
            newLevel = scanner.nextInt();
        }

        if (newLevel > 5)
            throw new RuntimeException("Wert ungültig. Es sind nur Werte zwischen 0 und 5 zugelassen");
        this.setLevel(newLevel);
    }
}
