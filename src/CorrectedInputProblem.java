import java.util.Scanner;

/**
 * Created by florije on 2015/10/12.
 */
public class CorrectedInputProblem {
    public static void main(String[] args) {
        // the variables
        String name;
        int age;
        double income;
        // scanner to get info
        Scanner keyboard = new Scanner(System.in);
        // get age
        System.out.println("What is your age?");
        age = keyboard.nextInt();
        // get income
        System.out.println("What is your income?");
        income = keyboard.nextDouble();
        // new line
        keyboard.nextLine();  // �����е�����,������ô��.
        // get user name
        System.out.println("What is your name?");
        name = keyboard.nextLine();

        // display info
        System.out.println("Hello " + name + ". Your age is " + age + " and your income is $" + income);
    }
}
