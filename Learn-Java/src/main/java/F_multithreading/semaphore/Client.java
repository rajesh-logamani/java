package F_multithreading.semaphore;

public class Client {
    public static void main(String[] args) {
        H2O h2o = new H2O();

        Runnable releaseHydrogen = () -> System.out.print("H");
        Runnable releaseOxygen = () -> System.out.print("O");

        Thread h1 = new Thread(() -> {
            try {
                h2o.hydrogen(releaseHydrogen);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread h2 = new Thread(() -> {
            try {
                h2o.hydrogen(releaseHydrogen);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread o = new Thread(() -> {
            try {
                h2o.oxygen(releaseOxygen);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        h1.start();
        h2.start();
        o.start();
    }
}
