import java.util.Scanner;

public class areaoftriangleheron {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double a = input.nextDouble();
        System.out.print("Enter side b: ");
        double b = input.nextDouble();
        System.out.print("Enter side c: ");
        double c = input.nextDouble();

        // Calculate semi-perimeter s
        double s = (a + b + c) / 2.0;

        // Calculate area using Math.sqrt for the square root
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("The semi-perimeter (s) is: %.2f\n", s);
        System.out.printf("The area of the triangle is: %.2f\n", area);
    }
}
