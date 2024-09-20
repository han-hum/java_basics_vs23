package week2;

import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number until what: ");
        int stop = Integer.parseInt(reader.nextLine());

        int memory = 1;
        int storage = 1;


        while (memory < stop) {
            memory++;
            storage += memory;

        }
        System.out.println("Sum is " + storage);
    }
}
