package F_multithreading.producerCounsumer.withProblem;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
        Store store = new Store();
        ExecutorService executorService = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 100; i++){
            executorService.execute(new Producer(store));
        }

        for(int i = 0 ; i < 100; i++){
            executorService.execute(new Consumer(store));
        }
    }
}
