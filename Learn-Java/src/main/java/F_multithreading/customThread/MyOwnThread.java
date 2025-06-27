package F_multithreading.customThread;

public class MyOwnThread extends  Thread {

    private int number;

    public MyOwnThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(number + " is running in thread: " + Thread.currentThread().getName());
    }

    @Override
    public  void start() {
        // Custom behavior before starting the thread
        System.out.println("Starting thread for number: " + number);
        super.start(); // Call the start method of the Thread class
    }

    // Main method to test the MyOwnThread class
    public static void main(String[] args) {
        // Create and start 50 threads
        for (int i = 0; i < 50; i++) {
            MyOwnThread thread = new MyOwnThread(i);
            thread.start();
        }
    }
}
