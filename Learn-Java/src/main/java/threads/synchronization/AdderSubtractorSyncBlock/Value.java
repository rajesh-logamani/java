package threads.synchronization.AdderSubtractorSyncBlock;

public class Value {
    private int value = 0;

    public  Value(int offset){
        this.value = offset;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
