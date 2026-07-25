public class Calculator {
    private boolean state;
    private double num1;
    private double num2;

    public Calculator() {
        this.state = true;
        this.num1 =0;
        this.num2 =0;
    }
    public Calculator(double num1, double num2){
        this.state = true;
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 + this.num2;
    }

    public double subtract(double num1, double num2) {
         this.num1 = num1;
        this.num2 = num2;
        return this.num1 - this.num2;
    }

    public double multiply(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        return this.num1 * this.num2;
    }

    public double divide(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        if (this.num2 == 0) {
            throw new ArithmeticException("Undefined");
        }
        return this.num1 / this.num2;
    }


    public double modulus(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        if (this.num2 == 0) {
            throw new ArithmeticException("Undefined");
        }
        return this.num1 % this.num2;
    }
    public double average(double... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Empty input");
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }
    public void set(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double getNum1(){
    return this.num1;
    }
    public double getNum2(){
        return this.num2;
    }
public void show(){
    System.out.println("Num1: " + this.num1 + ", Num2: " + this.num2);
System.out.println();
}
    }
