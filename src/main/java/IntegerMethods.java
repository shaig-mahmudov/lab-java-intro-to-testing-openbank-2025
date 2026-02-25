import java.util.ArrayList;

public class IntegerMethods {
    public int[] allOddIntegerFrom1ToN(int n){
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            if (i % 2 != 0){
                oddNumbers.add(i);
            }
        }
        return oddNumbers.stream().mapToInt(Integer::intValue).toArray();
    }
}
