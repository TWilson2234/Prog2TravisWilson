package SuperTrumpGame;

/**
 * Created by T'uKeyan on 7/10/2016.
 */
public class STCard {
    private int id;
    private String name;
    private double hardness;
    private double gravity;
    private String cleavage;
    private String crustal;
    private String value;

    public STCard(int id, String cardName, String cardHard, String cardGrav, String cardCleave, String cardCrust, String cardValue) {

        this.id = id;
        this.name = cardName;
        this.hardness = Double.parseDouble(cardHard);
        this.gravity = Double.parseDouble(cardGrav);
        this.cleavage = cardCleave;
        this.crustal = cardCrust;
        this.value = cardValue;
    }

    public String getName(){
        return name;
    }

    public double getHard(){
        return hardness;
    }

    public double getGrav(){
        return gravity;
    }

    public String getCleave(){
        return cleavage;
    }

    public String getCrust(){
        return crustal;
    }

    public String getValue(){
        return value;
    }

    public int getId() {
        return id;
    }
}
