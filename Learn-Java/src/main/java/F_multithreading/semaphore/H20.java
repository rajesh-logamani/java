package F_multithreading.semaphore;

import java.util.concurrent.Semaphore;

class H2O {

    private Semaphore semH = new Semaphore(2);
    private Semaphore semO = new Semaphore(1);
    private Semaphore barrier = new Semaphore(0);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        semH.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        barrier.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        semO.acquire();
        barrier.acquire(2);
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        semH.release(2);
        semO.release();

    }
}