package charactersTests;

import Building.Castle;
import Characters.Warlock;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class warlocksTest {

    Warlock warlock;
    Castle castle;
    Weapon weapon;


    @Before
    public void setUp() {
        warlock = new Warlock("Atlar", 35, 30, 100);
//        castle = new Castle("Hustle Castle");
//        weapon = new Weapon("Axe");
    }

    @Test
    public void hasName() {
        assertEquals("Atlar", warlock.getName());
    }

    @Test
    public void hasDamageValue() {
        assertEquals(35, warlock.getDamageValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(30, warlock.getAttackValue());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, warlock.getHealthValue());
    }

    @Test
    public void hasWeapon() {
        assertEquals("Fireball", weapon.getWeapon());

    }

}





