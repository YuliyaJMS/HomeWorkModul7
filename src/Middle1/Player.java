package Middle1;

public class Player {
    private int winCounter = 0;

    public void increaseWinCounter() {
        System.out.println("Вы угадали, получите балл!");
        winCounter++;
    }

    public int getWinCounter() {
        return winCounter;
    }
}


