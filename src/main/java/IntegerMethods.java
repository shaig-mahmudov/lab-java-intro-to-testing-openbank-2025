import java.util.stream.IntStream;

public class IntegerMethods {
    public int[] allOddIntegerFrom1ToN(int n) {
        return IntStream.rangeClosed(1, n).filter(i -> i % 2 != 0).toArray();
    }
}