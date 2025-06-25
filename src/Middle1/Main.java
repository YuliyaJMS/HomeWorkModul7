package Middle1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Thimble thimble = new Thimble();//создали игру
        Player player = new Player();// создалии игрока

        Scanner scanner = new Scanner(System.in);//создали сканер для пользовательского ввода

        while (player.getWinCounter() < 3) {
            System.out.println("Введите номер наперстка(0, 1 или 2): ");
            int answer = scanner.nextInt();//считываем ответ игрока
            int realNumber = thimble.showNumberThimble();//получаем ответ от компьютера

            if (answer == realNumber) {//сравниваем ответы
                player.increaseWinCounter();
            } else {
                System.out.println("Не угадали! Монетка была под напёрстком №" + realNumber);
            }
            System.out.println("Ваш результат: " + player.getWinCounter());
            System.out.println("-----------------------------");
        }
        System.out.println("Поздравляем! Вы набрали 3 очка и выиграли!");
    }
}