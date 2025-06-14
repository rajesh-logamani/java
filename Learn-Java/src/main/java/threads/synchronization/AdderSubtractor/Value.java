package threads.synchronization.AdderSubtractor;

public class Value {
    private int value;

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
