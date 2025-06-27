package F_multithreading.synchronization.AdderSubtractorLocks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Value value = new Value(0);
        Lock lock = new ReentrantLock();

        Adder adder = new Adder(value, lock);
        Subtractor subtractor = new Subtractor(value, lock);
        ExecutorService executorService = Executors.newCachedThreadPool();
        try {
            Future<Void> add = executorService.submit(adder);
            Future<Void> sub = executorService.submit(subtractor);

            add.get();
            sub.get();
            System.out.println(value.getValue());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            executorService.shutdown();
        }
    }
}
