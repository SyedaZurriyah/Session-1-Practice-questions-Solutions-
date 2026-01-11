import java.util.Scanner;

public class evenoddchecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer Number: ");
        int number = input.nextInt();

        // Dividing by 2 and checking the remainder
        if (number % 2 == 0) {
            System.out.println("EVEN:");
        } else {
            System.out.println("ODD:");
        }
    }
}