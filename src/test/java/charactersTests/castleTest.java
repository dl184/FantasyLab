package charactersTests;

import Building.Castle;
import Characters.*;
import Interfaces.IDamage;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class castleTest{

        Weapon cannon;
        Castle castle;
        Barbarian barbarian;

    @Before
    public void setUp() {
        cannon = new Weapon("Cannon");
        castle = new Castle("Greyskull", 1000);
        barbarian = new Barbarian("Conan", 20, 50, 100);
        }

    @Test
    public void castleHasFullHealth() {
        assertEquals(1000, castle.getCastleHealth());
    }

    @Test
    public void castlHasName() {
        assertEquals("Greyskull", castle.getName());
    }

    @Test
    public void barbarianCanAttackCastle() {
        barbarian.attack((IDamage) castle);
        assertEquals(950, castle.getHealthValue());
    }


}
