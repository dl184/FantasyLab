package Characters;

import Interfaces.IAttack;
import Interfaces.IDamage;
import Interfaces.IDefend;
import Interfaces.IHeal;

public class Dwarves extends Character implements IDamage, IAttack, IDefend {

    public Dwarves(String name, int damageValue, int attackValue, int healthValue) {
        super(name, damageValue, attackValue, healthValue);
    }

    public void takeDamage(int attackValue) {

    }

    public void attack(IDamage victim) {

    }
}
