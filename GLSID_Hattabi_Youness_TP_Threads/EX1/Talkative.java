import java.util.ArrayList;
import java.util.List;

public class Talkative implements Runnable {
    private int i;

    public Talkative(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(this.getI());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Talkative(i));
            thread.start();
            System.out.println();
        }
    }
}