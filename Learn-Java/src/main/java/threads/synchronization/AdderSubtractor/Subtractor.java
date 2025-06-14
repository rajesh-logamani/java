package threads.synchronization.AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private final  Value value;

    public Subtractor(Value value){
        this.value = value;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<100000; i++){
            value.setValue(value.getValue() - i);
        }
        return null;
    }
}
