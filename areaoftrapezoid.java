import java.util.Scanner;

public class areaoftrapezoid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking inputs for parallel sides and height
        System.out.print("Enter the length of parallel side 'a': ");
        double a = input.nextDouble();

        System.out.print("Enter the length of parallel side 'b': ");
        double b = input.nextDouble();

        System.out.print("Enter the perpendicular distance (height 'h'): ");
        double h = input.nextDouble();

        // Area formula: K = h * (a + b) / 2
        double area = h * (a + b) / 2.0;

        // Printing with 2 decimal places for precision
        System.out.printf("The area of the trapezoid is: %.2f\n", area);
    }
}