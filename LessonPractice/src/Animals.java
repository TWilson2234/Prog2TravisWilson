/**
 * Created by T'uKeyan on 16/09/2016.
 */
public class Animals {
    public Animals(int animalId) {
        String name;
        int age;
        int id = animalId;

        System.out.println("Animal Id = " + id);
    }

    public static void main(String[] args) {
        int id = -1;
        for (int x = 0; x < 5; x++) {
            id = id + 1;
            Animals y = new Animals(x);
        }

    }

}
