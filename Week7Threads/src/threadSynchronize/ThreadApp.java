package threadSynchronize;

public class ThreadApp {

    public static int saldo = 1000;

    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            new GeldOpname(Integer.toString(i)).start();
        }
    }
}
