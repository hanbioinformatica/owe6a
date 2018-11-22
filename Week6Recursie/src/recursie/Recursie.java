/*
 * Recursie.java
 *
 * Created on February 24, 2008, 2:53 PM
 *
 * (c) 2007 Martijn van der Bruggen
 * Update 2017 november
 * HAN University
 */
package recursie;

/**
 *
 * @author Martijn
 */
public class Recursie {

    public static boolean isDNA(String s) {

        char c = s.toUpperCase().charAt(0); //Bepaal of eerste karakter een DNA nucleotide is
        if (c == 'A' || c == 'T' || c == 'G' || c == 'C') {
            if (s.length() <= 1) {
                return true;
            }
        } else {
            return false;
        }
        return (isDNA(s.substring(1))); //Retourneer een call aan isDNA met alle nucleotiden min de eerste

    }

    public static int fibonacciRecursive(int k) {
        if (k <= 2) {
            return 1;
        } else {
            return fibonacciRecursive(k - 1) + fibonacciRecursive(k - 2);
        }
    }

    public static int fibonacciIterative(int k) {
        int one = 1, two = 0, fibno = 0;
        for (int i = 2; i <= k; i++) {
            fibno = one + two;
            two = one;
            one = fibno;
        }
        return fibno;
    }

    //Bereken de faculteit van een getal iteratief
    public static long factorialEen(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    //Bereken de faculteit van een getal recursief
    public static long factorialTwee(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorialTwee(n - 1);
        }
    }

    //Bereken de faculteit van een getal iteratief
    public static long functieEen(int n) {
        int result = 1;
        while (n > 1) {
            result *= n;
            n--;
        }
        return result;
    }

    //Bereken de faculteit van een getal recursief
    public static long functieTwee(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * functieTwee(n - 1);
        }
    }

    public static void main(String[] args) {
        int aantal = 50;
        long startTime = System.currentTimeMillis();
        System.out.println("Resultaat: " + fibonacciIterative(aantal));
        long endTime = System.currentTimeMillis();
        final long tijd1 = (endTime - startTime);
        System.out.println("Tijd (iteratief):" + tijd1);

        long startTime2 = System.currentTimeMillis();
        System.out.println("Resultaat: " + fibonacciRecursive(aantal));
        long endTime2 = System.currentTimeMillis();
        final long tijd2 = (endTime2 - startTime2);
        System.out.println("Tijd (recursief):" + tijd2);
        System.out.println("Iteratief versus recursief " + (float) tijd2 / (float) tijd1);
    }
}
