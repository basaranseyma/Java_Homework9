import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;

        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your username: ");
        userName = inp.nextLine();

        System.out.print("Please enter your password: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("You have logged in!");
        } else {
            System.out.print("Invalid information!\nWould you like to reset your password? Please press 1 to reset, 2 to cancel: ");
            select = inp.nextInt();

            if (select == 1) {
                System.out.println("Please enter your new password: ");
                newPassword = inp.next();

                if (newPassword.equals(password) || newPassword.equals("java123")) {
                    System.out.println("Password creation failed, please enter a different password.");
                } else {
                    System.out.println("Password created.");
                }
            } else if (select == 2) {
                System.out.println("Operation canceled.");
            } else {
                System.out.println("Invalid enter!");
            }
        }
    }
}
