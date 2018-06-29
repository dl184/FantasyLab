package Building;

public class Castle {

    private int healthValue;
    private String name;

    public Castle(String name, int healthValue){
        this.healthValue = 1000;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public int getCastleHealth(){
    return healthValue;
    }

    public void takeDamage(int value){
        this.healthValue -= (value);
    }
}
