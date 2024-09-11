package week2;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Up to what number?");
        int read = reader.nextInt();

        int number = 1;

        while (number <= read) {
            System.out.println(number);
            number++;
        }
    }
}
