import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class WizardTest {

    @Test
    public void testWizardProperties() {
        Wizard wizard = new Wizard(80, 15, 3, "Fireball");
        assertEquals("Fireball", wizard.getSpell());
    }

    @Test
    public void testConvertToElf() {
        Wizard wizard = new Wizard(80, 15, 3, "Fireball");
        Elf convertedElf = wizard.convertToElf();

        assertEquals(80, convertedElf.getHealth());
        assertEquals(15, convertedElf.getStrength());
        assertEquals(3, convertedElf.getLives());

        assertEquals(10, convertedElf.getSpeed());
    }

    @Test
    public void testCastRandomSpell() {
        SpellLibrary mockLibrary = mock(SpellLibrary.class);

        when(mockLibrary.getRandomSpell()).thenReturn("Fireball");
        Wizard wizard = new Wizard(80, 15, 3, "Default Spell", mockLibrary);
        String result = wizard.castRandomSpell();

        assertEquals("Casting Fireball", result);

        verify(mockLibrary, times(1)).getRandomSpell();
    }
}