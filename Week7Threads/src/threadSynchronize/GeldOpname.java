package threadSynchronize;

import threads.*;

class GeldOpname extends Thread {

    public GeldOpname(String str) {
        super(str);
    }

    public synchronized void neemGeldOp(int bedrag) {
        int temp_saldo = ThreadApp.saldo;
        System.out.println(getName() + " Opnemen van " + bedrag);
        try {
            sleep((int) (Math.random() * 1000));
            temp_saldo -= bedrag;
        } catch (InterruptedException e) {
        }
        ThreadApp.saldo = temp_saldo;
        System.out.println("Saldo is " + ThreadApp.saldo);
    }

    public void run() {

       
        System.out.println("DONE! " + getName() + " ...");
        System.out.println(ThreadApp.saldo);

    }
}
