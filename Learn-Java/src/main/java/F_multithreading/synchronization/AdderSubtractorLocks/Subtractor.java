package F_multithreading.synchronization.AdderSubtractorLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private final Value value;
    private final Lock lock;

    public Subtractor(Value value, Lock lock){
        this.value = value;
        this.lock = lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<100000; i++){
            lock.lock();
            value.setValue(value.getValue() - i);
            lock.unlock();
        }
        return null;
    }
}
