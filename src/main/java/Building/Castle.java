package Building;

public class Castle {

    private int healthValue;
    private String name;

    public Castle(){
        this.healthValue = 1000;
    }

    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getCastleHealthValue(){
    return healthValue;
    }

    public void takeDamage(int value){
        this.healthValue -= (value);
    }
}
