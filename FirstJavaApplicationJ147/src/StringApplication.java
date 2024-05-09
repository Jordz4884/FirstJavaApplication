import java.util.Scanner;

public class StringApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();

        System.out.println("From which word in the sentence would you like to start a restructured sentence?");
        String word = input.nextLine();

        int indexOfWord = sentence.indexOf(word);
        System.out.println(
                sentence.substring(indexOfWord)
        );

    }
}
