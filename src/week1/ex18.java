package week1;

import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());

        if (points >= 50 && points <= 60) {
            System.out.println("5");
        } else if (points >= 45 && points <= 49) {
            System.out.println("4");
        } else if (points >= 40 && points <= 44) {
            System.out.println("3");
        } else if (points >= 35 && points <= 39) {
            System.out.println("2");
        } else if (points >= 30 && points <= 34) {
            System.out.println("1");
        } else {
            System.out.println("failed");
        }
    }
}
