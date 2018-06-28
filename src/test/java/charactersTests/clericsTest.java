package charactersTests;

import Building.Castle;
import Characters.Cleric;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class clericsTest {


        Cleric cleric;
        Castle castle;
        Weapon weapon;


        @Before
        public void setUp() {
            cleric = new Cleric("Jozan", 85, 5, 100);
//        castle = new Castle("Hustle Castle");
//        weapon = new Weapon("Axe");
        }

        @Test
        public void hasName() {
            assertEquals("Jozan", cleric.getName());
        }

        @Test
        public void hasDamageValue() {
            assertEquals(85, cleric.getDamageValue());
        }

        @Test
        public void hasAttackValue() {
            assertEquals(5, cleric.getAttackValue());
        }

        @Test
        public void hasHealthValue() {
            assertEquals(100, cleric.getHealthValue());
        }

    }

