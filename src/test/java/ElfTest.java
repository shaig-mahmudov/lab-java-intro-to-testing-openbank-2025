import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ElfTest {

    @Test
    public void testElfProperties() {
        Elf elf = new Elf(90, 25, 3, 15);
        assertEquals(15, elf.getSpeed());

        elf.setSpeed(20);
        assertEquals(20, elf.getSpeed());
    }
}