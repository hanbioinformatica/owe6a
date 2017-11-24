package threads;

public class ThreadApp {

    public static void main(String args[]) {
        new SimpleThread("bio").start();
        new SimpleThread("informatica").start();
    }
}
