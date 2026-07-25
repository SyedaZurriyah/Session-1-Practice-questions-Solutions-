public class Main{
    public static void main(String[] args) {
        Calculator casio = new Calculator();

        
        System.out.println("Basic Operations: ");
        System.out.println("3 + 8 = " + casio.add(3, 8));
        System.out.println("10 - 5 = " + casio.subtract(10, 5));
        System.out.println("2 * 8 = " + casio.multiply(2, 8));
        System.out.println("9 / 2 = " + casio.divide(9, 2));

        
        System.out.println("\n Modulus Tests :");
        System.out.println("Normal: 9 % 2 = " + casio.modulus(9, 2));
        
        try {
            System.out.print("Edge case (10 % 0): ");
            casio.modulus(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

       
        System.out.println("\n Average Tests:");
        System.out.println("Normal (10, 20, 30): " + casio.average(10, 20, 30));
        
        try {
            System.out.print("Edge case (no numbers): ");
            casio.average();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("\nShow test: ");
        casio.set(5.0, 10.0);
        casio.show();
        
    }
}