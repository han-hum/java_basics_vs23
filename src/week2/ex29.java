package week2;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 2;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}
