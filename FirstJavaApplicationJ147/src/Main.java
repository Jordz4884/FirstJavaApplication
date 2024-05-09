import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = new String("String name");
        String text = "Some sort of text";

        System.out.println(
                text.substring(4)//takes in one index and returns
        );

        System.out.println(
                str.substring(6, 10)//takes in 2 indexes, the first being the position to start from
                //the second being the index to end at.
        );

        System.out.println(str.equalsIgnoreCase(text));
        //the string provided have the same value regardless
        System.out.println(str.equals(text));
        //case into consideration
        char e = text.charAt(3);///return the char in the string found at
        System.out.println(e);

        boolean startsWithSome = text.startsWith("Some");//checks if the string starts
        //starts checking from the beginning of the string
        System.out.println(startsWithSome);

        //str = "String name"
        boolean startsWithRing = str.startsWith("tring", 1);
        //from the index we declared starts with the
        System.out.println(startsWithRing);

        String toLowerCase = str.toLowerCase();
        String toUpperCase = str.toUpperCase();

        System.out.println("str in lower case : " + toLowerCase);
        System.out.println("str in upper case : " + toUpperCase);

        //These methods are useful when performing string searches.
        //str = "String name"

        int indexOfS = str.indexOf('S');//takes in a character and checks which index the character is found at
        System.out.println("The index of S in "
                + str + " is : "
                + indexOfS
        );

        int indexOfWithStartIndex = str.indexOf('r', 1);
        System.out.println(indexOfWithStartIndex);

        //str = "String name"
        int indexOfWithString = str.indexOf("Stri");
        System.out.println(indexOfWithString);

        int indexOfWithStringAndStartIndex = str.indexOf("name", 1);
        System.out.println(indexOfWithStringAndStartIndex);

        str = "String name name name";

        int lastIndexOfChar = str.lastIndexOf('n');
        System.out.println("Last index of n : " + lastIndexOfChar);

        int lastIndexOfCharWithStartingIndex = str.lastIndexOf('n', 8);
        System.out.println("Last index of n starting at index 8 : " + lastIndexOfCharWithStartingIndex);

        int lastIndexOfString = str.lastIndexOf("name");
        System.out.println("Last index of name : " + lastIndexOfString);

        int lastIndexOfStringWithFromIndex = str.lastIndexOf("name", 8);
        System.out.println("Last index of name from index 8 : " + lastIndexOfStringWithFromIndex);

        Scanner input = new Scanner(System.in);

        String insert = input.nextLine();
        System.out.println(insert);

    }
}