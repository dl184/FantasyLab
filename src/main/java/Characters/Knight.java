package Characters;

import Interfaces.IAttack;
import Interfaces.IDamage;
import Interfaces.IDefend;

public class Knight extends Character implements IAttack, IDamage, IDefend {

    public Knight(String name, int damageValue, int attackValue, int healthValue) {
        super(name, damageValue, attackValue, healthValue);
    }

    public void takeDamage(int attackValue) {

    }

    public void attack(IDamage victim) {

    }
}

