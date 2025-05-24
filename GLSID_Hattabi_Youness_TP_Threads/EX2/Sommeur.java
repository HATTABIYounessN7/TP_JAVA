import java.util.ArrayList;
import java.util.List;

public class Sommeur implements Runnable {
    private List<Integer> input;
    private int start, end, sum = 0;

    public Sommeur(List<Integer> input, int start, int end) {
        this.input = input;
        setStart(start);
        setEnd(end);
    }

    public List<Integer> getInput() {
        return input;
    }

    public void setInput(List<Integer> input) {
        this.input = input;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        if (start > this.input.size() || start < 0) {
            return;
        }

        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        if ((end > this.input.size() || end < this.start) || end < 0) {
            return;
        }

        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += this.input.get(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 0; i < 10; i++) {
            list.add(i * 2);
        }

        for (int i = 0; i < 10; i++) {
            list.add(i * 3);
        }

        Sommeur sommeur1 = new Sommeur(list, 0, 10);
        Sommeur sommeur2 = new Sommeur(list, 10, 20);
        Sommeur sommeur3 = new Sommeur(list, 20, 30);

        new Thread(sommeur1).start();
        new Thread(sommeur2).start();
        new Thread(sommeur3).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of sommeur 1 : " + sommeur1.getSum());
        System.out.println("Sum of sommeur 2 : " + sommeur2.getSum());
        System.out.println("Sum of sommeur 3 : " + sommeur3.getSum());

        System.out.println("Final Sum  : " + (sommeur1.getSum() + sommeur2.getSum() + sommeur3.getSum()));
    }
}
