package charactersTests;

import Building.Castle;
import Characters.Wizard;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class wizardsTest {


        Wizard wizard;
        Castle castle;
        Weapon weapon;


        @Before
        public void setUp() {
            wizard = new Wizard("Gandalf", 30, 60, 100);
//        castle = new Castle("Hustle Castle");
//        weapon = new Weapon("Axe");
        }

        @Test
        public void hasName() {
            assertEquals("Gandalf", wizard.getName());
        }

        @Test
        public void hasDamageValue() {
            assertEquals(30, wizard.getDamageValue());
        }

        @Test
        public void hasAttackValue() {
            assertEquals(60, wizard.getAttackValue());
        }

        @Test
        public void hasHealthValue() {
            assertEquals(100, wizard.getHealthValue());
        }

    }

