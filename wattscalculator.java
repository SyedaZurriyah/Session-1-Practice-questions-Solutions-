import java.util.Scanner;

public class wattscalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the voltage in (Volts): ");
        double volts = input.nextDouble();

        System.out.print("Enter the current in (Amperes): ");
        double amps = input.nextDouble();

        // Formula: Watts = Volts * Amps
        double watts = volts * amps;

        System.out.println("Power Consumption: " + watts + " Watts");
    }
}