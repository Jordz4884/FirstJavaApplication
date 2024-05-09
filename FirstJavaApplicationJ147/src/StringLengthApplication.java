import java.util.Scanner;

public class StringLengthApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first string:");
        String firstString = input.nextLine();

        System.out.println("Please enter your second string:");
        String secondString = input.nextLine();

        String stringSum = firstString + secondString;
        int stringLength = stringSum.length();

        System.out.println(stringSum + " is " + stringLength + " characters long");

    }
}
