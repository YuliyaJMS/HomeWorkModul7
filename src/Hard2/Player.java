package Hard2;

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

        public Move chooseMove(Scanner scanner) {
            Move[] moves = Move.values();

            System.out.println(name + ", выберите ход:");
            for (int i = 0; i < moves.length; i++) {
                System.out.println(i + " — " + moves[i]);
            }

            int choice = -1;
            while (choice < 0 || choice >= moves.length) {
                System.out.print("Введите номер хода: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                } else {
                    scanner.next(); // пропускаем некорректный ввод
                    System.out.println("Введите число от 0 до " + (moves.length - 1));
                }
            }

            return moves[choice];
        }
    }
