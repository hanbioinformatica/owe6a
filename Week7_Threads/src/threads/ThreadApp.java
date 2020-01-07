package threads;

public class ThreadApp {

    public static void main(String args[]) {
        new SimpleThread("bio").run();
        new SimpleThread("informatica").run();
    }
}
