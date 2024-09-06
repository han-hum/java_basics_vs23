package week1;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameFirst = reader.nextLine();

        System.out.print("Type your age: ");
        int ageFirst = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String nameSecond = reader.nextLine();

        System.out.print("Type your age: ");
        int ageSecond = Integer.parseInt(reader.nextLine());

         int result = ageFirst + ageSecond;
        System.out.println(nameFirst + " and " + nameSecond + " are " + result + " years old in total");

    }
}
