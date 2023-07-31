package thread;

public class ThreadExample {

    static class MyThread extends Thread {
        public void run() {
            System.out.println("run");
        }
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }

}
