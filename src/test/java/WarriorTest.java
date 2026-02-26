import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {

    @Test
    public void testWarriorProperties() {
        Warrior warrior = new Warrior(120, 30, 2, 50);
        assertEquals(50, warrior.getForce());
    }

    @Test
    public void testConvertToElf() {
        Warrior warrior = new Warrior(120, 30, 2, 50);
        Elf convertedElf = warrior.convertToElf();

        assertEquals(120, convertedElf.getHealth());
        assertEquals(30, convertedElf.getStrength());
        assertEquals(2, convertedElf.getLives());

        assertEquals(50, convertedElf.getSpeed());
    }
}