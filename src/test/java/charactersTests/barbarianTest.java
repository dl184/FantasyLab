package charactersTests;

import Building.Castle;
import Characters.Barbarian;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class barbarianTest {

    Barbarian barbarian;
    Castle castle;
    Weapon weapon;


    @Before
    public void setUp() {
        barbarian = new Barbarian("Conan", 10, 30, 100);
//        castle = new Castle("Hustle Castle");
//        weapon = new Weapon("Axe");
        }

    @Test
    public void hasName() {
        assertEquals("Conan", barbarian.getName());
    }

    @Test
    public void hasDamageValue() {
        assertEquals(10, barbarian.getDamageValue());
    }

    @Test
    public void hasAttackValue() {
        assertEquals(30, barbarian.getAttackValue());
    }

    @Test
    public void hasHealthValue() {
        assertEquals(100, barbarian.getHealthValue());
    }

//    @Test
//    public void canAttackCastle() {
//        barbarian.attack(castle);
//
//    }
}

