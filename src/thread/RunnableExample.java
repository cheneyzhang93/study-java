package thread;

public class RunnableExample {

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("run");
        }
    }

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }

}
