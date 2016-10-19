import java.util.ArrayList;

/**
 * Created by T'uKeyan on 18/10/2016.
 */
public class CheckForValue {
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(20);
        intList.add(50);
        intList.add(30);
        intList.add(20);

        for (int i = 0; i < intList.size(); i++) {
            if (intList.contains(20)) {
                System.out.println("is 20");
            } else {
                System.out.println(intList.get(i));
            }
        }
    }
}

