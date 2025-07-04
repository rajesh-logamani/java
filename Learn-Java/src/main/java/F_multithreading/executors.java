package F_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executors implements Runnable {

    private int number;

    public executors(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " is running in thread: " + Thread.currentThread().getName());
    }

    // AbstractClassImplementsInterface method to test the runnableThread class
    public static void main(String[] args) {
        //Use thread executor to manage threads
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//        for (int i = 0; i < 50; i++) {
//            executor.execute(new runnableThread(i));
//        }
//        executor.shutdown();

        //Use thread executor to manage threads
//        ExecutorService executorCached = Executors.newCachedThreadPool();
//        for (int i = 0; i < 50; i++) {
//            executorCached.execute(new executors(i));
//        }
//        executorCached.shutdown();

        // try with resources to automatically close the executor
        try (ExecutorService executor = Executors.newCachedThreadPool()) {
            for (int i = 0; i < 50; i++) {
                executor.execute(new executors(i));
            }
        } // The executor will be automatically shut down here
        catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that may occur
        }

    }
}
