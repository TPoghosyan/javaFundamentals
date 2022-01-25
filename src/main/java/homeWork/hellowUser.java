package homeWork;

import java.util.Scanner;

public class hellowUser {

    public static String userName;

    public static void main(String[] args) {
        System.out.print("Please type your name here     \"");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();

        System.out.println("Hellow dear " + userName);

    }

}
