package thread;

public class DaemonExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample.MyRunnable());
        thread.setDaemon(true);
    }

}
