package Hard1;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public Game() {
        scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру «Виселица»!");
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();

        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void start() {
        System.out.println(player1.getName() + ", вы будете загадывать слово.");
        String word = player1.enterWord(scanner);
        Word secretWord = new Word(word);
        Hangman hangman = new Hangman();
        boolean gameOver = false;

        System.out.println("Игра начинается! " + player2.getName() + ", у вас 6 попыток.");

        while (!gameOver) {
            System.out.println("\n" + player2.getName() + ", попробуйте угадать букву.");
            hangman.draw();
            System.out.println("Текущее состояние слова: " + secretWord.getCurrentState());

            char letter = player2.guessLetter(scanner);

            if (secretWord.checkLetter(letter)) {
                System.out.println("Есть такая буква!");

                if (secretWord.isWordGuessed()) {
                    System.out.println("\n🎉 Поздравляем, " + player2.getName() + "! Вы угадали слово: " + word);
                    player2.increaseScore();
                    gameOver = true;
                }
            } else {
                System.out.println("Нет такой буквы.");
                hangman.makeStep();

                if (hangman.isGameOver()) {
                    System.out.println("\n💀 Игра окончена! Слово было: " + word);
                    System.out.println("Вы проиграли, " + player2.getName() + " :(");
                    player1.increaseScore();
                    gameOver = true;
                }
            }
        }

        // Конец игры — выводим счёт
        System.out.println("\n--- Счёт ---");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());
    }
}
