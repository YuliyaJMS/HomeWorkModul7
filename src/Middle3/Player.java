package Middle3;

import java.util.Scanner;

public class Player {
    private Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public int makeMove() {
        System.out.println("Введите ваш ход (0 - камень, 1 - ножницы, 2 - бумага):");
        int choice = scanner.nextInt();
        return choice;
    }

    public String getMoveName(int move) {
        switch (move) {
            case 0:
                return "камень";
            case 1:
                return "ножницы";
            case 2:
                return "бумага";
            default:
                return "Некорректный ввод, попробуйте снова!";

        }
    }
}
