package threadSynchronize;

import static java.lang.Thread.sleep;

public class ThreadApp {

    public static void main(String args[]) {

        //We nemen 10 keer snel achter elkaar geld op
        for (int i = 1; i <= 10; i++) {

            try {
                GeldOpname go = new GeldOpname(Integer.toString(i));
                go.start();
                go.join();
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException ex) {

            }
        }

    }
}
