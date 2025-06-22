package threads.producerCounsumer.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {

    public static void main(String[] args) {
        Store store = new Store();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Semaphore producerSemaphore = new Semaphore(Store.MAX_SIZE);
        Semaphore consumerSemaphore = new Semaphore(0);
        for(int i = 0 ; i < 100; i++){
            executorService.execute(new Producer(store,producerSemaphore, consumerSemaphore));
        }

        for(int i = 0 ; i < 100; i++){
            executorService.execute(new Consumer(store,producerSemaphore, consumerSemaphore));
        }
    }
}
