/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author martijn
 */
public class DNA implements Comparable {

    private String sequence;

    public DNA(String s) {
        sequence = s;
    }

    public int getLength() {
        return sequence.length();
    }

    public double getGC() {
        double gc = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == 'G' || sequence.charAt(i) == 'C') {
                gc++;
            }
        }
        return (gc / sequence.length()) * 100;
    }

    @Override
    public String toString() {
        return sequence + " GC%:" + getGC() + " ";
    }

    @Override
    public int compareTo(Object o) {
        DNA d = (DNA) o;
        return this.sequence.compareTo(d.sequence);
    }

}
