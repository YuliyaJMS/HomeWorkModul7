package Middle3;

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
        System.out.println("Добро пожаловать в игру «Камень-ножницы-бумага»!");

        boolean playAgain = true; //флаг, хочет ли продолжить игру
        while (playAgain) {
            playRound();

            System.out.println("Хотите сыграть ещё раз? (да/нет)");
            String answer = scanner.next();

            if (!answer.equalsIgnoreCase("да")) {
                playAgain = false;
            }
        }
        System.out.println("Спасибо за игру!");

    }

    private void playRound() {
        computer.makeMove(); //вызов, чтобы компьютер сделал ход
        int computerMove = computer.getMove();

        int playerMove = player.makeMove(); //игрок делает ход

        //вывести ходы
        System.out.println("Ваш ход: " + player.getMoveName(playerMove));
        System.out.println("Ход компьютера: " + computer.getMoveName(computerMove));

        String result = determineWinner(playerMove, computerMove);
        System.out.println("Результат: " + result);

    }

    private String determineWinner(int playerMove, int computerMove) {
        if (playerMove == computerMove) {
            return "Ничья";
            // камень(0) побеждает ножницы(1)
            // ножницы(1) побеждают бумагу(2)
            // бумага(2) побеждает камень(0)
        }
        if (
                (playerMove == 0 && computerMove == 1 || playerMove == 1 && computerMove == 2 ||
                        playerMove == 2 && computerMove == 0)
        ) {
            return "Вы выиграли!";
        } else {
            return "Компьютер выиграл!";
        }

    }
}