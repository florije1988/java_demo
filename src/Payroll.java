/**
 * Created by florije on 2015/10/8.
 */
public class Payroll {
    public static void main(String[] args) {
        int hours = 40;
        double grossPay, payRate = 25.0;

        grossPay = hours * payRate;
        System.out.println("Your gross pay is $" + grossPay);
    }
}
