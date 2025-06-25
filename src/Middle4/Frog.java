package Middle4;

public class Frog {
    private int jumpCount;

    public void jump(int steps) {
        jumpCount += steps;
    }

    public int getJumpCount() {
        return jumpCount;
    }
}
