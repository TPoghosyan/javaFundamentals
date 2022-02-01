package homeWork;

import java.util.Scanner;

public class HellowUser {

    public static String userName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type your name here     \"");
        userName = scanner.nextLine();
        boolean x = checkFirstUpper(userName);
        while (checkDigits(userName) || !checkFirstUpper(userName)) {
            if (checkDigits(userName)) {
                System.out.println("name may note contain digits ");
            }else if (!checkFirstUpper(userName)) {
                System.out.print("the name should start with Uppercase");
            }
            userName = scanner.nextLine();
        }
        System.out.println("hellow dear  " + userName);
    }

    static boolean checkDigits(String sample) {
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean digits = false;
        for (char c : chars) {
            if (Character.isDigit(c)) {
                digits = true;
            }
        }
        return digits;
    }

    static boolean checkFirstUpper(String sample) {
        char[] chars = sample.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean upperCase = false;
        if (Character.isUpperCase(chars[0])) {
            upperCase = true;
        }
        return upperCase;
    }

}


