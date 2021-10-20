import java.util.Scanner;

public class FindLargest {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = scan.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is larger than " + number2);
        }

        if (number1 == number2) {
            System.out.println(number1 + " and " + number2 + " are equal");
        }

        if (number1 < number2) {
            System.out.println(number2 + " is larger than " + number1);
        }

        // Prompt the user for two integer variables

        // Create a series of if statements that will print which number is larger or if they are equal
        // Make sure your output matches the samples or the tests will not pass.
    }
}
