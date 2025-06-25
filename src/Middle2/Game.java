package Middle2;

import java.util.Scanner;

public class Game {
    private Computer computer;
    private Player player;
    private Scanner scanner;

    public Game() {
        computer = new Computer();
        player = new Player();
        scanner = new Scanner(System.in);

    }

    public void start() {
        System.out.println("Добро пожаловать в игру Угадай число!");
        System.out.println("Выберите режим");
        System.out.println("1 - Без ограничения попыток");
        System.out.println("2 - С ограничениями попыток");

        int mode = scanner.nextInt();

        if (mode == 1) {
            unlimitedAttemptsMode();
        } else if (mode == 2) {
            limitedAttemptsMode();

        } else {
            System.out.println("Ошибка! Выберите нужный режим");
        }
    }

    private void unlimitedAttemptsMode() {
        computer.generateNumber(1, 10); //от 1 до 10
        int guess = 0;

        while (true) {
            guess = player.makeGuess();
            if (computer.checkGuess(guess)) {
                System.out.println("Вы угадали, поздравляем!");
                break;
            } else {
                System.out.println(computer.getHint(guess));
            }
        }
    }

    private void limitedAttemptsMode() {
        computer.generateNumber(1, 10);
        System.out.println("Сколько попыток Вы хотите? ");
        int maxAttempts = scanner.nextInt();
        boolean guessed = false;

        for (int i = 1; i <= maxAttempts; i++) {
            System.out.println("Попытка" + i + " из " + maxAttempts);
            int guess = player.makeGuess();

            if (computer.checkGuess(guess)) {
                guessed = true;
                System.out.println("Вы угадали, поздравляем!");
                break;
            } else {
                System.out.println(computer.getHint(guess));
            }
        }
        if (!guessed) {
            System.out.println("Вы не угадали. Загаданное число было: " + computer.getSecretNumber());
        }

    }
}
