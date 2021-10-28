import java.util.Scanner;

public class LoneTeen {
    public static Boolean loneTeen(int a, int b) {
        if (a>=13 && a<= 19) {
            if (b >=13 && b<= 19) {
                return false;
            }
            else {
                return true;
            }
        }
        else if (b >=13 && b<= 19) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficients for a quadratic equation: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(loneTeen(a, b));
    }

    // In the space below, write the loneTeen method. Make sure the signature matches
    // the one given in the instructions.
}
