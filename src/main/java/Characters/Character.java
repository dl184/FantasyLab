package Characters;

import Interfaces.IAttack;
import Interfaces.IDamage;
import Interfaces.IDefend;
import Interfaces.IHeal;

public abstract class Character implements IAttack, IDamage, IHeal, IDefend {

    private String name;
    private int damageValue;
    private int attackValue;
    private int healthValue;

    public Character(String name, int damageValue, int attackValue, int healthValue) {
        this.name = name;
        this.damageValue = damageValue;
        this.attackValue = attackValue;
        this.healthValue = 100;

    }

    public Character(String name, int damageValue, int healthValue) {
        this.name = name;
        this.damageValue = damageValue;
        this.healthValue = 100;
    }


    public String getName() {
        return name;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }
}
