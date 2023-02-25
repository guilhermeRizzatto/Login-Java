import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Insert your \nUsername:");
        String username = keyboard.nextLine().trim();
        String newUsername;
        String password;
        if (username.length() <= 10) {
            System.out.println("Your username is too short, only: " + username.length() + "\tcaracters");
            System.out.println("Please do a username with more or equal than 10 caracters");
            System.out.print("Insert your \nUsername:");
            newUsername = keyboard.nextLine().trim();
            if (newUsername.length() >= 10) {
                System.out.print("Password:");
                password = keyboard.next().trim();
                System.out.println("Your username is: " + newUsername + "\tand your password is: " + password);
            }
        } else {
            System.out.print("Password:");
            password = keyboard.next().trim();
            System.out.println("Your username is: " + username + "\tand your password is: " + password);
        }

    }
}