
package threadSynchronize;


/**
 * Voorbeeld van: https://www.javahelps.com/2015/04/thread-synchronization-in-java.html
 * (c) HAN University 
 * Instituut Toegepaste Biologie en Chemie
 * Bio-informatica
 * 
 */

public class ConcurrencyProblem {
    static int[] array = {0};

    public static void main(String[] args) throws InterruptedException {
        Thread a = new Thread() {
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    increase();
                }
            }
        };

        Thread b = new Thread() {
            public void run() {
                for(int i = 1; i <= 1000; i++) {
                    decrease();
                }
            }
        };

        a.start();
        b.start();
        a.join();
        b.join();
        System.out.println(array[0]);
    }

    public synchronized static void increase() {
        array[0]++;
    }

    public synchronized static void decrease() {
        array[0]--;
    }
}