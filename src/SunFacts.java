/**
 * Created by florije on 2015/10/10.
 */
public class SunFacts {
    public static void main(String[] args) {
        double distance, mass;
        distance = 1.495979E11;
        mass = 1.989E30;
        System.out.println("The sun is " + distance + " meters away.");
        System.out.println("The sun's mass is " + mass + " kilograms.");

        boolean bool;
        bool = true;
        System.out.println(bool);
        bool = false;
        System.out.println(bool);

        char letter;
        letter = 'A';
        System.out.println(letter);
        letter = 'B';
        System.out.println(letter);

        char anoletter = 65;
        System.out.println(anoletter);
        anoletter = 66;
        System.out.println(anoletter);

        int month = 2, days = 28;
        System.out.println("Month "+ month + " has " + days + " days.");

        double regularWages;
        double basePay = 25;
        double regualrHoure = 40;
        double overtimeWages;
        double overtimePay = 37.5;
        double overtimeHours = 10;
        double totalWages;

        regularWages = basePay * regualrHoure;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;
        System.out.println("Wages for this week are $" + totalWages);

        System.out.println(5 / 2.0);

        double monthlyPay = 6000.0;
        double contribution;

        contribution = monthlyPay * 0.05;
        System.out.println("5 percent is $" + contribution + " per month.");
        contribution = monthlyPay * 0.08;
        System.out.println("8 percent is $" + contribution + " per month.");
        contribution = monthlyPay * 0.1;
        System.out.println("10 percent is$ " + contribution + " per month.");

        double regularPrice = 59.0;
        double discount, salePrice;
        discount = regularPrice * 0.2;
        salePrice = regularPrice - discount;
        System.out.println("Regulsr price: $" + regularPrice);
        System.out.println("Discount amount: $" + discount);
        System.out.println("Sale price: $" + salePrice);

        System.out.println(Math.PI);

        final double INTEREST_RATE = 0.082;
        System.out.println(INTEREST_RATE);

        String name = "florije";
        System.out.println(name);
        System.out.println(name.length());

    }
}
