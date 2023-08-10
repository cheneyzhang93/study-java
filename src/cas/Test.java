package cas;

public class Test {

    private int i=0;
    public synchronized int add(){
        return i++;
    }
}
