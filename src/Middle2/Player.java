package Middle2;

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);

    }
    public int makeGuess() {
        System.out.print("Введите число: ");
        int guess = scanner.nextInt();
        return guess;

    }
}
