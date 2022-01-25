package homeWork;

import java.util.Scanner;

public class SummOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputDataCount = 3;
        int summOfInput =0;
        for (int i = 0; i < inputDataCount; i++) {
            summOfInput  = summOfInput + scanner.nextInt();

        }
        System.out.println("summ is equals = " + summOfInput);
    }


}



