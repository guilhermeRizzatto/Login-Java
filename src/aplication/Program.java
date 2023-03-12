package aplication;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<User> list = new ArrayList<>();

        System.out.print("How many users, you would like to create? ");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("User #" + (i + 1));
            sc.nextLine();
            System.out.print("Username:");
            String name = sc.next();
            while((name.length() < 10)) {
                System.out.println("Your username is too short, only: " + name.length() + " caracters");
                System.out.println("Please insert a username with 10 or more caracters");
                name = sc.next();
                while (hasName(list, name)) {
                    System.out.println("This username already exists! please try again: ");
                    name = sc.next();
                }
            }
            while (hasName(list, name)) {
                System.out.println("This username already exists! please try again: ");
                name = sc.next();
                while((name.length() < 10)) {
                    System.out.println("Your username is too short, only: " + name.length() + " caracters");
                    System.out.println("Please insert a username with 10 or more caracters");
                    name = sc.next();
                }
            }
            System.out.print("Password: ");
            String password = sc.next();
            System.out.println();
            User user = new User(name, password);
            list.add(user);
        }

        for (User x : list) {
            System.out.println(x);
        }
        sc.close();
    }

    static boolean hasName(List<User> list, String name) {
        User user = list.stream().filter(x -> x.getName().equals(name)).findFirst().orElse(null);
        return user != null;
    }
}
