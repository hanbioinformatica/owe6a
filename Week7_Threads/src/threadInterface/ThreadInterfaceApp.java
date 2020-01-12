/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadInterface;


/**
 *
 * @author martijn
 */
public class ThreadInterfaceApp {

    public static void main(String a[]) {
        for (int i = 0; i < 10; i++) {
            SimpleRunnableThread mrt1 = new SimpleRunnableThread("A");
            Thread t1 = new Thread((Runnable) mrt1);
            t1.run();
        }
        for (int i = 0; i < 10; i++) {

            SimpleRunnableThread mrt2 = new SimpleRunnableThread("B");
            Thread t2 = new Thread((Runnable) mrt2);
            t2.run();
        }
    }
}
