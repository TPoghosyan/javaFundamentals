package homeWork;

import java.util.Scanner;

public class ReservOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputDataCount = 3;
        String inputData[] = new String[inputDataCount];
        for (int i = 0; i < inputDataCount; i++) {
            System.out.println("Please type your data here");
            inputData[i] = scanner.nextLine();

        }

        for (int i = 0; i < inputDataCount; i++) {
            System.out.print((inputData[inputDataCount - i - 1]) + "  ");
        }


    }
}
