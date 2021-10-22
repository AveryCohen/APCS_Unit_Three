import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int a) {
        boolean palinyes = true;
        boolean palinno = false;
        int b = a % 10;
        int c = (a % 100) - b;
        int d = a / 10000;
        int e = a / 1000;
        if (a <= 99999) {
            if (a >9999) {
                if (b == d) {
                    if (c == e) {
                        return palinyes;
                    }
                    else {
                        return palinno;
                    }
                }
                else {
                    return palinno;
                }
            }
            else {
                return palinno;
            }
        }
        else {
            return palinno;
        }




    }

    // Write your isPalindrome method in the space below. You do not need to write a main method for this program
    // Your method should be static.

}
