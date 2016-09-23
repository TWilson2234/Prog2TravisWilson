/**
 * Created by T'uKeyan on 5/09/2016.
 */
public class appending {
    public static void main(String[] args) {

        int [] arr = {1, 2, 5, 6};
        StringBuffer str = new StringBuffer("you are ");

        str.append(arr[0]);

        System.out.println(str);
    }
}
