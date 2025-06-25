package Middle3;

public class Computer {
    private int move;

    public void makeMove() {

        move = (int) (Math.random() * 3);
    }

    public int getMove() {

        return move;
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
