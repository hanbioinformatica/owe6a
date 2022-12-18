package threadSynchronize;

class GeldOpname extends Thread {

    static int saldo = 1000;
    
    public GeldOpname(String str) {
        super(str);
            }

    public synchronized void neemGeldOp(int bedrag)  {
        int temp_saldo = saldo;
        System.out.println(getName() + " Opnemen van " + bedrag + " van " + temp_saldo);
        try {
            temp_saldo -= bedrag;
            sleep((int) (Math.random() * 1000));

        } catch (InterruptedException e) {
        }
        saldo = temp_saldo;
        System.out.println("Saldo is " + saldo);
    }

    @Override
    public void run() {

        System.out.println("Geldopname " + getName() + " ...");
        neemGeldOp(100);
        System.out.println(saldo);

    }
}
