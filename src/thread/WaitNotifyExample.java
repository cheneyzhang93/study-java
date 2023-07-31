package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class WaitNotifyExample {

    public synchronized void before() {
        System.out.println("before");
        notify();
        notify();
    }

    public synchronized void middle(){
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
        System.out.println("middle");
    }

    public synchronized void after() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        WaitNotifyExample example = new WaitNotifyExample();
        executorService.execute(() -> example.middle());
        executorService.execute(() -> example.after());
        executorService.execute(() -> example.before());
    }

}
