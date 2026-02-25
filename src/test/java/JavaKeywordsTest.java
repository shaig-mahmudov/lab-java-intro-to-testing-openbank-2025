import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class JavaKeywordsTest {
    private JavaKeywords checker;

    @BeforeEach
    public void setUp() {
        checker = new JavaKeywords();
    }

    @Test
    public void givenStringWithJavaKeyword_whenChecked_thenReturnsTrue() {
        assertTrue(checker.containsJavaKeyword("Don't break my heart"));
    }

    @Test
    public void givenStringWithoutJavaKeyword_whenChecked_thenReturnsFalse() {
        assertFalse(checker.containsJavaKeyword("I love to breakdance"));
    }

    @Test
    public void givenEmptyString_whenChecked_thenReturnsFalse() {
        assertFalse(checker.containsJavaKeyword(""));
    }
}