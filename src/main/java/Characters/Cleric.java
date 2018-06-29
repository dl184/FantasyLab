package Characters;

import Interfaces.IDamage;
import Interfaces.IDefend;
import Interfaces.IHeal;

public class Cleric extends Character implements IHeal, IDefend {

    public Cleric(String name, int damageValue, int healthValue) {
        super(name, damageValue, healthValue);
    }

    public void takeDamage(int attackValue) {

    }

    public void attack(IDamage victim) {

    }
}
