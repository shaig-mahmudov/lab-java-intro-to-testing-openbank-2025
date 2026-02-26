import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegerMethodsTest {
    private IntegerMethods method;

    @BeforeEach
    public void setUp() {
        method = new IntegerMethods();
    }

    @Test
    public void allOddIntegerFrom1ToN_validNumber_returnsTrue() {
        int[] result = method.allOddIntegerFrom1ToN(5);
        assertEquals(3, result.length, "The array should have 3 odd numbers from 1 to 5");
    }

    @Test
    public void allOddIntegerFrom1ToN_noOddNumbers_returnsEmpty() {
        int[] result = method.allOddIntegerFrom1ToN(0);
        assertEquals(0, result.length, "The array should be empty when n is 0");
    }

    @Test
    public void allOddIntegerFrom1ToN_validNumber_returnsCorrectArray() {
        int[] expected = {1, 3, 5};
        int[] actual = method.allOddIntegerFrom1ToN(5);
        assertArrayEquals(expected, actual, "The array should contain 1, 3, and 5");
    }

    @Test
    public void allOddIntegerFrom1ToN_negativeNumber_returnsEmpty() {
        int[] actual = method.allOddIntegerFrom1ToN(-5);
        assertEquals(0, actual.length, "The array should be empty for negative inputs");
    }
}