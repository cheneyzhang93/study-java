package cas;

import java.util.concurrent.atomic.AtomicInteger;

public class Test1 {

    private AtomicInteger i = new AtomicInteger(0);

    public int add() {
        return i.addAndGet(1);
    }

}
