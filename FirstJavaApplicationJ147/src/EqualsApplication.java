import java.util.Scanner;

public class EqualsApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //capture the first string
        System.out.println("Please enter your first string:");
        String firstInput = input.nextLine();

        //capture the second string
        System.out.println("Please enter your second string:");
        String secondInput = input.nextLine();

        boolean areStringsEqual = firstInput.equals(secondInput);

        System.out.println("Are the two strings equal? " + areStringsEqual);

    }
}
