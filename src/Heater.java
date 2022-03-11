import java.io.IOException;
import java.util.*;

public class Heater {

    private int level = 0;

    public int getLevel(){
        return this.level;
    }

    public void setLevel(int level){
        this.level = level;
        System.out.println("Neue Stufe: " + level);
    }

    public void selectLevel() throws RuntimeException, IOException{
        int newLevel=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine neue Heizstufe ein (1-5): ");
        newLevel = scanner.nextInt();
        System.out.println("newLevel: " + newLevel);
        if(newLevel>5) throw new RuntimeException("Wert ungültig. Es sind nur Werte zwischen 0 und 5 zugelassen");
        this.setLevel(newLevel);

    }
    
}
