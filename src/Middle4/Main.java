package Middle4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в игру «Лягушки»!");

        System.out.print("Игрок 1, введите имя: ");
        String name1 = scanner.nextLine();

        System.out.print("Игрок 2, введите имя: ");
        String name2 = scanner.nextLine();

        Game game = new Game(name1, name2);
        game.start();
    }

}
