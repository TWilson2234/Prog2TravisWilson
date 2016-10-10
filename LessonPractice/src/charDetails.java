/**
 * Created by T'uKeyan on 1/10/2016.
 */
public class charDetails {
    protected int id;
    protected String name;

    public charDetails(int charId, String charName) {
        id = charId;
        name = charName;

    }

    public void showCharDetails(){
        System.out.println("Character name is " + name + ". The ID is " + id);

    }
}
