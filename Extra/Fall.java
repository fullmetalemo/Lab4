package Extra;

import java.util.Scanner;
import characters.Characters;
import objects.*;

public class Fall extends Objects {
    private int number = 0;

    public Fall(String name) {
        super(name);
    }

    public void falling() {
    }

    public class BalloonException extends Exception {
    }

    public void speed() {
        System.out.println("С какой скорорстью начал падать воздушный шар (км/ч)?");
        Scanner scanner = new Scanner(System.in);
        try {
            int x = Integer.parseInt(scanner.next());
            if (x == 0) {
                System.out.println("Шар не падал... окей");
            } else if (x < 0) {
                try {
                    throw new BalloonException();
                } catch (BalloonException exception) {
                    System.out.println("Шар не может взлететь в данной ситуации!");
                    this.speed();
                }
            } else if (x > 15) {
                try {
                    throw new BalloonException();
                } catch (BalloonException exception) {
                    System.out.println("Слишком быстро...введите число меньше");
                    this.speed();
                }
            } else {
                number = x;
                System.out.println("Шар начал падать со скоростью " + number + " км в ч.");
            }
        } catch (NumberFormatException exception) {
            this.speed();
        }
    }
}