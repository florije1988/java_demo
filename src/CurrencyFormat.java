/**
 * Created by florije on 2015/10/12.
 */
public class CurrencyFormat {
    public static void main(String[] args) {
        double monthlyPay = 5000.0;
        double annualPay = monthlyPay * 12;
        System.out.printf("Your annual pay is $%,.2f\n", annualPay);

        double amount = 1234567.8901;
        System.out.printf("%,15.2f\n", amount);
        int number = 20000;
        System.out.printf("The number is:%6d\n", number);
        System.out.printf("The number is:%,10d", number);
        double pad_number = 123.4;
        System.out.printf("The number is:%08.1f\n", pad_number);
        int ano_number = 1234;
        System.out.printf("The number is:%07d", ano_number);
    }
}
