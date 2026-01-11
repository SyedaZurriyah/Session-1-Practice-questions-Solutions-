import java.util.Scanner;

public class Discountcalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original selling price: ");
        double originalPrice = input.nextDouble();

        System.out.print("Enter thediscount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * originalPrice;
        double discountedPrice = originalPrice - discountAmount;

        System.out.println("The Discounted Selling Price: " + discountedPrice);
    }
}
