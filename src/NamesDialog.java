import javax.swing.*;

/**
 * Created by florije on 2015/10/12.
 */
public class NamesDialog {
    public static void main(String[] args) {
        String firstName;
        String middleName;
        String lastName;

        firstName = JOptionPane.showInputDialog("What is your firstName?");
        middleName = JOptionPane.showInputDialog("What is your middleName?");
        lastName = JOptionPane.showInputDialog("What is your lastName?");

        JOptionPane.showMessageDialog(null, "Hello " + firstName+ " " + middleName + " " + lastName);
        System.exit(0);
    }
}
