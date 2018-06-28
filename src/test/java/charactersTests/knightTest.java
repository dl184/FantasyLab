package charactersTests;

import Building.Castle;
import Characters.Knight;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class knightTest {

    Knight knight;
    Castle castle;
    Weapon weapon;


    @Before
    public void setUp() {
        knight = new Knight("Black Knight", 20, 15, 100);
//        castle = new Castle("Hustle Castle");
//        weapon = new Weapon("Axe");
    }

    @Test
    public void hasName() {
        assertEquals("Black Knight", knight.getName());
    }

    @Test
    public void hasDamageValue() {
        assertEquals(20, knight.getDamageValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(15, knight.getAttackValue());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, knight.getHealthValue());
    }

}
