package F_multithreading;

public class runnableThread implements Runnable {

    private int number;

    public runnableThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " is running in thread: " + Thread.currentThread().getName());
    }

    // AbstractClassImplementsInterface method to test the runnableThread class
    public static void main(String[] args) {
//         Create and start 50 threads
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new runnableThread(i));
            thread.start();
        }
    }
}
