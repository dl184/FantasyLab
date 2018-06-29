package Characters;

import Interfaces.IAttack;
import Interfaces.IDamage;
import Interfaces.IDefend;
import Interfaces.IHeal;

public class Barbarian extends Character implements IAttack, IDamage, IDefend {
    public Barbarian(String name, int damageValue, int attackValue, int healthValue) {
        super(name, damageValue, attackValue, healthValue);
    }

    public void takeDamage(int attackValue) {

    }

    public void attack(IDamage victim) {

    }
}
