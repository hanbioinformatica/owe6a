/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadInterface;

class SimpleRunnableThread implements Runnable {

    String naam;

    public SimpleRunnableThread(String n) {
        naam = n;
    }

    public void run() {
        try {
            System.out.println("Start van thread " + naam);
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException iex) {
            System.out.println("Exception in thread: " + iex.getMessage());
        }
        System.out.println("Eind van thread " + naam);
    }
}
