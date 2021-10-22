import java.util.Scanner;

public class DiscriminantAndRoots {

    // Create the method roots in the space below.
    public static String roots(int a, int b, int c) {
        double discriminant = Math.pow((double)(b), 2) -4 * (a * c);
        if(discriminant > 0) {
            String tworeal = a + "x^2 + " + b + "x + " + c + " has 2 real roots";
            return tworeal;
        }
        else if(discriminant == 0) {
            String onereal = a + "x^2 + " + b + "x + " + c + " has 1 real root";
            return onereal;
        }
        else {
            String twoimagine = a + "x^2 + " + b + "x + " + c + " has 2 imaginary roots";
            return twoimagine;
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the coefficients for a quadratic equation: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(roots(a, b, c));

    }
}
