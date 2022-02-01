package homeWork;

import java.util.Scanner;

public class HellowUser {

    public static String userName;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type your name here     \"");
        userName = scanner.nextLine();
        boolean x = checkFirstUpper(userName);
        while (checkDigits(userName) || !checkFirstUpper(userName) || checkLength(userName)) {
            if (checkDigits(userName)) {
                System.out.println("name cannot contain numbers ");
                System.out.println("please try again ");
            } else if (!checkFirstUpper(userName)) {
                System.out.print("name must start with a capital letter");
                System.out.println("please try again ");
            }else if (checkLength(userName)){
                System.out.println("Name must contain more than 2 letters");
                System.out.println("please try again ");
            }
            userName = scanner.nextLine();
        }
        System.out.println("hellow dear  " + userName);
    }

    static boolean checkDigits(String sample) {
        char[] chars = sample.toCharArray();
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
        boolean upperCase = false;
        if (Character.isUpperCase(chars[0])) {
            upperCase = true;
        }
        return upperCase;
    }

    static boolean checkLength(String sample) {
        char[] chars = sample.toCharArray();
         boolean length = false;
        if (chars.length < 3) {
            length = true;
        }
        return length;
    }

}


