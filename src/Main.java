import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username = "";
        String password = "";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Insert your Username: ");
            username = scanner.nextLine().trim();
            if (username.length() >= 10)
                break;
            System.out.println("Your username is too short, only: " + username.length() + " caracters");
            System.out.println("Please insert a username with 10 or more caracters");
        }
        System.out.print("Insert your password: ");
        password = scanner.nextLine().trim();
        System.out.println("Your username is: " + username + "\nand your password is: " + password);
    }
}