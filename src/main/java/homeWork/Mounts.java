package homeWork;

import java.util.Scanner;

public class Mounts {
    public static void main(String[] args) {
        String monts[] = new String[]{"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};


        Scanner scanner = new Scanner(System.in);
        System.out.println("please type int numbers 1-12");
        boolean nextInt = scanner.hasNextInt();
        if (nextInt) {
            int number = scanner.nextInt();
            if (number > 0 && number < 13) {
                System.out.println("the" + number + " mounth is " + "\"" + monts[number - 1] + "\"");
            } else {
                System.out.println("please run program again and type int numbers 1-12");
            }

        } else {
            System.out.println("please run program again and type int numbers 1-12");
        }



    }


}
