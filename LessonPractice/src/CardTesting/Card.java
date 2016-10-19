package CardTesting;

/**
 * Created by T'uKeyan on 14/10/2016.
 */
public class Card {
    private String name;
    private int value;
    public Card(String cardName, int cardValue) {
        this.name = cardName;
        this.value = cardValue;

    }

    public void setName(String cardName) {
        name = cardName;
    }

    public void setValue(int cardValue) {
        value = cardValue;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}
