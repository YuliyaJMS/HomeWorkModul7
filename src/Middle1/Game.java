package Middle1;

import java.util.Scanner;

public class Game {
    private Thimble thimble;
    private Player player;
    private Scanner scanner;

    public Game() {
        this.thimble = new Thimble();
        this.player = new Player();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Добро пожаловать в игру 'Угадай напёрсток'!");

        while (player.getWinCounter() < 3) {
            playRound();
        }
        System.out.println("Поздравляем! Вы набрали 3 очка и выиграли!");
    }

    private void playRound() {
        System.out.println("Введите номер наперстка(0, 1 или 2): ");
        int answer = scanner.nextInt();
        int realNumber = thimble.showNumberThimble();

        if (answer == realNumber) {//сравниваем ответы
            player.increaseWinCounter();
        } else {
            System.out.println("Не угадали! Монетка была под напёрстком №" + realNumber);
        }
        System.out.println("Ваш результат: " + player.getWinCounter());
        System.out.println("-----------------------------");
    }
}
