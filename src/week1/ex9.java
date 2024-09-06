package week1;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        double result = (double)numberOne / numberTwo;
        System.out.println(result);

    }
}
