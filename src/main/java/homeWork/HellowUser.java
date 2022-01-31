package homeWork;

import java.util.Scanner;

public class HellowUser {

    public static String userName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type your name here     \"");
        userName = scanner.nextLine();
        while (checkDigits(userName)) {
            System.out.print("type true name \"");
            userName = scanner.nextLine();
        }
        System.out.println("hellow dear  " + userName);
    }

    static boolean checkDigits(String sample) {
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean x = false;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                x = true;
            }
        }
        return x;
    }

}


