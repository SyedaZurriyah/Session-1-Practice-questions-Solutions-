import java.util.Scanner;

public class originalpricecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the discounted selling price: ");
        double discountedPrice = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Formula: Original = DiscountedPrice / (1 - (discount/100))
        double originalPrice = discountedPrice / (1 - (discountPercent / 100));

        System.out.println("The Original Selling Price: " + originalPrice);
    }
}