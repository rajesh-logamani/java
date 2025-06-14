package threads.synchronization.AdderSubtractorSyncMethod;

public class Value {
    private int value = 0;

    public Value(int offset){
        this.value = offset;
    }

    public synchronized int getValue() {
        return value;
    }

    public synchronized void add(int delta) {
        this.value += delta;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
