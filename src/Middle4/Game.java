package Middle4;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;

    public Game(String name1, String name2) {
        this.player1 = new Player(name1);
        this.player2 = new Player(name2);

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Игра началась! Каждый игрок делает ход по очереди.");

        System.out.println("Ход игрока: " + player1.getName());
        System.out.print("Нажмите Enter, чтобы бросить кость");
        scanner.nextLine();

        while (gameRunning) {
            int steps1 = player1.makeMove();
            player1.getFrog().jump(steps1);
            System.out.println(player1.getName() + ", всего прыжков " + player1.getFrog().getJumpCount());

            if (checkWin(player1.getFrog())) {
                System.out.println("Поздравляем, " + player1.getName() + " Вы выиграли!");
                gameRunning = false;
                continue;
            }

            System.out.println("Ход игрока: " + player2.getName());
            System.out.print("Нажмите Enter, чтобы бросить кость");
            scanner.nextLine();

            int steps2 = player2.makeMove();
            player2.getFrog().jump(steps2);
            System.out.println(player2.getName() + ", всего прыжков " + player2.getFrog().getJumpCount());

            if (checkWin(player2.getFrog())) {
                System.out.println("Поздравляем, " + player2.getName() + " Вы выиграли!");
                gameRunning = false;
            }
        }
    }

    private boolean checkWin(Frog frog) {
        return frog.getJumpCount() >= 30;
    }
}
