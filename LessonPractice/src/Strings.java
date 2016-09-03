/**
 * Created by T'uKeyan on 26/08/2016.
 */
public class Strings {
    public static void main(String[] args) {

        char letter = 'A';
        String word = "Hello";
        int wordQuant;

        /* Comparing
        if(var1.comparator(var2)) {
         */

        wordQuant = word.length();

        System.out.println(wordQuant);
        System.out.printf("The word %s has %s letters \n", word, wordQuant);
        System.out.println(word.charAt(0));


    }
}
