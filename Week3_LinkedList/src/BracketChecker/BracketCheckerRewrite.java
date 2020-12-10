package BracketChecker;

import java.io.IOException;
import java.util.Stack;
/**
 * @author Martijn van der Bruggen
 * @version 22 november 2018
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
 */
public class BracketCheckerRewrite {

    public static void check(String input) {
        
        Stack<Character> theStack = new Stack<>();

        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '{': // opening symbols
                case '[':
                case '(':
                    theStack.push(ch); // push them
                    break;

                case '}': // closing symbols
                case ']':
                case ')':
                    if (!theStack.isEmpty()) // if stack not empty,
                    {
                        char chx = theStack.pop(); // pop and check
                        if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                            System.out.println("Error: " + ch + " at " + j);
                        }
                    } else // prematurely empty
                    {
                        System.out.println("Error: " + ch + " at " + j);
                    }
                    break;
                default: // no action on other characters
                    break;
            }
        }
        if (!theStack.isEmpty()) {
            System.out.println("Error: missing right delimiter");
        }
    }

    public static void main(String[] args) throws IOException {
        String invoer = "{(7*2)5*4)}";
        System.out.println(invoer);
        check(invoer);
        
    }
}
