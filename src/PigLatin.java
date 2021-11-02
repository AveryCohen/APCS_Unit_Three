import java.util.Locale;
import java.util.Scanner;

public class PigLatin {

    public static String makePigLatin(String word) {
        word.toLowerCase(Locale.ROOT);
if (word.indexOf("a") == 0 || word.indexOf("e") == 0 || word.indexOf("i") == 0 || word.indexOf("o") == 0 || word.indexOf("u") == 0) {
String pigWordVowel = word + "yay";
    return pigWordVowel;
}
else if (word.indexOf("y") >= 0) {
    if (word.indexOf("y") == 0) {
        return (word.substring(1) + "yay");
    }
    else if (word.indexOf("y") == 1) {
        return (word.substring(1) + word.substring(0, 1) + "ay");
    }
    else {

    }
    String pigWordY = word + "ay";
    return pigWordY;
}
else {
    String pigWord
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        System.out.println(makePigLatin(word));
    }
}
