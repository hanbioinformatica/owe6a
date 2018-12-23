package threadSynchronize;

import threads.*;

class SimpleThread extends Thread {
    
    int saldo;

    public SimpleThread(String str) {
        super(str);
    }

    public void run() {
        int temp_saldo = saldo;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " " + getName());
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
        saldo = temp_saldo + 10;
        System.out.println("DONE! " + getName() + " ...");
        System.out.println(temp_saldo);
    }
}
