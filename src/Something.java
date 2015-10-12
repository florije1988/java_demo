/**
 * Created by florije on 2015/10/12.
 */
public class Something {
    public static void main(String[] args) {
        double number = 10.0 / 6.0;
        System.out.println(number);
        System.out.printf("I love Java programming.");
        double sales = 12345.67;
        System.out.printf("Our sales is %f for the day.\n", sales);
        double temp1 = 72.5, temp2 = 83.7;
        System.out.printf("The temperatures are %f and %f degrees.\n", temp1, temp2);
        int hours = 40;
        System.out.printf("I worked %d hours this week.\n", hours);
        double temp = 78.42819;
        System.out.printf("The temperature is %.2f degrees.\n", temp);
        System.out.printf("The temperature is %.1f degrees.\n", temp);
        double value1 = 123.45678;
        double value2 = 123.45678;
        double value3 = 123.45678;
        System.out.printf("%.1f %.2f %.3f\n", value1, value2, value3);

        double ano_number = 12345.6789;
        System.out.printf("The number is:%20f\n", ano_number);
        System.out.printf("The number is:%12.2f\n", ano_number);
    }
}
