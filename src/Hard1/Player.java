package Hard1;

import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public void increaseScore() {
        score++;
    }

    public String enterWord(Scanner scanner) {
        System.out.print(name + ", введите загаданное слово: ");
        return scanner.nextLine().toLowerCase();
    }

    public char guessLetter(Scanner scanner) {
        System.out.println(name + ", введите букву: ");
        String input = scanner.nextLine().toLowerCase();
        while (input.length() !=1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Введите одну букву!");
            input = scanner.nextLine().toLowerCase();
        }
        return input.charAt(0);
    }
}
