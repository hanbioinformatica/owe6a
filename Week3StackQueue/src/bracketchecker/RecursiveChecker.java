/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bracketchecker;

public class RecursiveChecker {

    public static void main(String[] args) {
        boolean b = RecursiveChecker.Check("ATGGAGAGCCAT");
        System.out.println(b);
    }

    private String unchecked;

    public RecursiveChecker(String sequence) {
        unchecked = sequence.toUpperCase();
    }

    public static boolean Check(String unchecked) {
        unchecked = unchecked.toUpperCase();
        System.out.println(unchecked);

        if (unchecked.length() > 0) {
            System.out.println(unchecked.charAt(unchecked.length()));
            if (unchecked.charAt(unchecked.length() - 1) == 'A'
                    || unchecked.charAt(unchecked.length() - 1) == 'T'
                    || unchecked.charAt(unchecked.length() - 1) == 'G'
                    || unchecked.charAt(unchecked.length() - 1) == 'C') {
                Check(unchecked.substring(0, unchecked.length() - 1));
            } else {
                return false;
            }
        } else {
            return true;
        }
        System.out.println(unchecked.length());
        return false;
    }
}
