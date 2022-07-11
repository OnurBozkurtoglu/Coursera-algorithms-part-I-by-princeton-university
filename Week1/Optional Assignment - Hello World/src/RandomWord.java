import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        int count = 0;
        String word = "";
        while(!StdIn.isEmpty()) {
            String temp = StdIn.readString();
            count++;
            if (StdRandom.bernoulli(1.0 / count)) {
                word = temp;
            }
        }
        StdOut.println(word);
    }
}