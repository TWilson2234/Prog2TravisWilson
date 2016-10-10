/**
 * Created by T'uKeyan on 5/10/2016.
 */

public class Card {
    private int id;
    private String name;
    private double hardness;
    private double gravity;
    private String cleavage;
    private String crustal;
    private String value;

    public Card() {

    }

    public Card(int cardId, String cardName, String cardHard, String cardGrav, String cardCleave, String cardCrust, String cardValue) {

        id = cardId;
        name = cardName;
        hardness = Double.parseDouble(cardHard);
        gravity = Double.parseDouble(cardGrav);
        cleavage = cardCleave;
        crustal = cardCrust;
        value = cardValue;
    }

    public void setId(int cardId){
        id = cardId;
    }

    public int getId(){
        return id;
    }

    public void setName(String cardName){
        name = cardName;
    }

    public String getName(){
        return name;
    }

    public void setHard(double cardHard){
        hardness = cardHard;
    }

    public double getHard(){
        return hardness;
    }

    public void setGrav(double cardGrav){
        gravity = cardGrav;
    }

    public double getGrav(){
        return gravity;
    }

    public void setCleave(String cardCleave){
        cleavage = cardCleave;
    }

    public String getCleave(){
        return cleavage;
    }

    public void setCrust(String cardCrust){
        crustal = cardCrust;
    }

    public String getCrust(){
        return crustal;
    }

    public void setValue(String cardValue){
        value = cardValue;
    }

    public String getValue(){
        return value;
    }

    public void testPrint(){
        System.out.printf("%s %s %s %s \n", this.getId(), this.getName(), this.getHard(), this.getGrav());
    }
}
