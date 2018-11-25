package reverseString;

/**
 * @author Martijn van der Bruggen
 * @version 22 november 2018 (c) HAN University Instituut Toegepaste Biologie en
 * Chemie Bio-informatica
 *
 */
import java.util.Stack;

public class StackReverse {

    public static void main(String[] args) {

        final String inputString = "code review";

        final String reversed = reverseString(inputString);
        System.out.println("The reversed string is " + reversed);

    }

    public static String reverseString(String originalString) {
        Stack<Character> stack = new Stack<>();
        String reversed = "";
        for (int i = 0; i < originalString.length(); i++) {
            char ch = originalString.charAt(i);
            stack.push(ch);
        }
        for (int i = 0; i < originalString.length(); i++) {
            char ch = stack.pop();
            reversed = reversed + ch;

        }
        return reversed;

    }

}
