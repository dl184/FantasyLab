package charactersTests;

import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class weaponTest {

    Weapon sword;
    Weapon axe;
    Weapon club;

    @Before
    public void setUp() {
        sword = new Weapon("Sword");
        axe = new Weapon("Axe");
        club = new Weapon("Club");
    }


    @Test
    public void hasType() {
        assertEquals("Sword", sword.getType());
        assertEquals("Axe", axe.getType());
        assertEquals("Club", club.getType());
    }

    @Test
    public void hasDamageValue() {
        assertEquals("Sword", sword.getDamageValue());
        assertEquals("Axe", axe.getDamageValue());
        assertEquals("Club", club.getDamageValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals("Sword", sword.getAttackValue());
        assertEquals("Axe", axe.getAttackValue());
        assertEquals("Club", club.getAttackValue());
    }

    @Test
    public void hasWeapon() {
        assertEquals("Sword", sword.getWeapon());
        assertEquals("Axe", axe.getWeapon());
        assertEquals("Club", club.getWeapon());
    }
}