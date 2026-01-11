import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter obtained marks: ");
        double obtained = input.nextDouble();

        System.out.print("Enter maximum marks: ");
        double maximum = input.nextDouble();

        double percentage = (obtained / maximum) * 100;

        System.out.println("Percentage Marks: " + percentage + "%");
    }
}