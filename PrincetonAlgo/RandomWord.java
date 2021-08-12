import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = null;
        int count = 1;
        String a;
        while (!StdIn.isEmpty()) {
            a = StdIn.readString();
            if (StdRandom.bernoulli(1 / count)) {
                champion = a;
                count++;
            }
        }
        System.out.println(champion);
    }
}
