import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    class DummyPlayer extends Player {
        public DummyPlayer(int health, int strength, int lives) {
            super(health, strength, lives);
        }
    }

    @Test
    public void testInitialization() {
        Player player = new DummyPlayer(100, 20, 3);
        assertEquals(100, player.getHealth());
        assertEquals(20, player.getStrength());
        assertEquals(3, player.getLives());
    }

    @Test
    public void testAttack() {
        Player attacker = new DummyPlayer(100, 25, 3);
        Player defender = new DummyPlayer(100, 10, 3);

        attacker.attack(defender);

        assertEquals(75, defender.getHealth());
    }

    @Test
    public void testDecrementLive() {
        Player player = new DummyPlayer(100, 20, 3);

        player.setHealth(50);
        player.decrementLive();

        assertEquals(2, player.getLives());
        assertEquals(100, player.getHealth());
    }

    @Test
    public void testCheckHealthTriggersDecrement() {
        Player player = new DummyPlayer(100, 20, 3);

        player.setHealth(-10);
        player.checkHealth();

        assertEquals(2, player.getLives());
        assertEquals(100, player.getHealth());
    }
}