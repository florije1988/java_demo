/**
 * Created by florije on 2015/10/12.
 */
public class Columns {
    public static void main(String[] args) {
        // Declare a variety of double variables.
        double num1 = 127.899;
        double num2 = 3446.148;
        double num3 = 3.667;
        double num4 = 264.821;
        double num5 = 88.081;
        double num6 = 1799.999;

        System.out.printf("%8.2f\n", num1);
        System.out.printf("%8.2f\n", num2);
        System.out.printf("%8.2f\n", num3);
        System.out.printf("%8.2f\n", num4);
        System.out.printf("%8.2f\n", num5);
        System.out.printf("%8.2f\n", num6);

        double amount = 1234567.89;
        System.out.printf("%,f\n", amount);
        double sales = 28756.89;
        System.out.printf("Sales for the month are %,.2f\n", sales);
    }
}
