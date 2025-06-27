package F_multithreading.producerCounsumer.withProblem;

public class Producer implements Runnable {
    private Store store;

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        while (true) {
            if (store.getItems().size() < Store.MAX_SIZE)
                store.add(new Object());
        }
    }
}
