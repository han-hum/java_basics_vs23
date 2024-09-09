package week1;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type the password: ");

            String password = reader.nextLine();

            if (password.equals("carrot")) {
                System.out.println("Right! \n");
                System.out.println("Yay, this is the secret msg!");
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
    }
}
