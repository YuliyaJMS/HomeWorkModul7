package Middle4;


public class Player {
    private String name;
    private Frog frog;

    public Player(String name) {
        this.name = name;
        this.frog = new Frog();
    }

    public String getName() {
        return name;
    }

    public Frog getFrog() {
        return frog;
    }

    public int makeMove() {
        int steps = (int) (Math.random() * 6) + 1;
        System.out.println("Выпало " + steps + ". Лягушка сделала " + steps + " прыжков.");
        return steps;
    }
}
