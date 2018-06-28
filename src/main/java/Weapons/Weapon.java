package Weapons;

public class Weapon {
    private String weapon;
    private int damageValue;
    private String type;
    private int attackValue;

    public Weapon(String type) {
        this.type = type;

    }


    public String getType() {
        return type;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getDamageValue() {
        return damageValue;
    }
}




