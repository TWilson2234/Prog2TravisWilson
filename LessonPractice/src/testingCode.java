/**
 * Created by T'uKeyan on 29/08/2016.
 */
public class testingCode {
    public static void main(String[] args) {

        String str = "Hello World";
        int leng = str.length();

        for (int x = 0; x < leng; x++) {
            if (str.charAt(x) == ' ') {
                System.out.println(" ");
            } else {
                System.out.println(str.charAt(x));
            }
        }
    }
}
