package Hard2;

import java.util.Scanner;

public class Game {
        private Player player1;
        private Player player2;
        private Computer computer;
        private Scanner scanner;

        public Game() {
            scanner = new Scanner(System.in);
            System.out.println("Добро пожаловать в игру «Камень-ножницы-бумага-колодец»!");

            System.out.print("Введите имя игрока: ");
            String name = scanner.nextLine();

            player1 = new Player(name);
            player2 = new Player("Компьютер");
            computer = new Computer();
        }

        public void start() {
            boolean playAgain = true;

            while (playAgain) {
                playRound();
                System.out.print("Хотите сыграть ещё раз? (да/нет): ");
                String answer = scanner.next();
                if (!answer.equalsIgnoreCase("да")) {
                    playAgain = false;
                }
            }

            System.out.println("\n--- Финальный счёт ---");
            System.out.println(player1.getName() + ": " + player1.getScore());
            System.out.println(player2.getName() + ": " + player2.getScore());
            System.out.println("Спасибо за игру!");
        }

        private void playRound() {
            Move playerMove = player1.chooseMove(scanner);
            Move computerMove = computer.makeMove();

            System.out.println(player1.getName() + " выбрал: " + playerMove);
            System.out.println(player2.getName() + " выбрал: " + computerMove);

            if (playerMove == computerMove) {
                System.out.println("Ничья!");
                return;
            }

            if (isPlayerWin(playerMove, computerMove)) {
                System.out.println("Вы выиграли раунд!");
                player1.increaseScore();
            } else {
                System.out.println("Компьютер выиграл раунд!");
                player2.increaseScore();
            }
        }

        private boolean isPlayerWin(Move playerMove, Move computerMove) {
            return switch (playerMove) {
                case КАМЕНЬ -> computerMove == Move.НОЖНИЦЫ;
                case НОЖНИЦЫ -> computerMove == Move.БУМАГА;
                case БУМАГА -> computerMove == Move.КАМЕНЬ || computerMove == Move.КОЛОДЕЦ;
                case КОЛОДЕЦ -> computerMove == Move.КАМЕНЬ || computerMove == Move.НОЖНИЦЫ;
            };
        }
    }
