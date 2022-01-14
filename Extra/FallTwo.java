package Extra;

import characters.Characters;

import java.util.Scanner;

public class FallTwo extends Characters {
    private int number = 0;

    public FallTwo(String name) {
        super(name);
    }

    public void falling() {
    }

    public static class FallingException extends RuntimeException {
        public void falling() {
            System.out.println("Было ли избежным падение? 1 - да, 2 - нет.");
            Scanner scanner = new Scanner(System.in);

            try {
                int x = Integer.parseInt(scanner.next());
                if (x == 1) {
                    System.out.println("Вы ошибаетесь.");
                } else{
                    System.out.println("Верно!");
                }
            } catch (NumberFormatException exception) {
                this.falling();
            }
        }
    }
}