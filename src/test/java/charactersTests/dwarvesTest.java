package charactersTests;

import Building.Castle;

import Characters.Dwarves;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class dwarvesTest {

    Dwarves dwarves;
    Castle castle;
    Weapon weapon;


    @Before
    public void setUp() {
        dwarves = new Dwarves("Sneezy", 70, 10, 100);
//        castle = new Castle("Hustle Castle");
//        weapon = new Weapon("Axe");
    }

    @Test
    public void hasName() {
        assertEquals("Sneezy", dwarves.getName());
    }

    @Test
    public void hasDamageValue() {
        assertEquals(70, dwarves.getDamageValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(10, dwarves.getAttackValue());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, dwarves.getHealthValue());
    }

}
