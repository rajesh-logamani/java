package H_collections.labSession.Item;

import java.util.PriorityQueue;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress;
    private PriorityQueue<Order> priorityQueue = new PriorityQueue<>();

    public Order(String orderId, boolean isExpress){
        this.orderId = orderId;
        this.isExpress = isExpress;
    }

    public void addOrder(Order order){
        priorityQueue.add(order);
    }

    public  void processOrder(){
        Order order = priorityQueue.poll();
        System.out.println("Processed order: " + order.orderId);
    }

    @Override
    public int compareTo(Order o) {
        // Express orders have higher priority
        if (this.isExpress == o.isExpress) return 0;
        return this.isExpress ? -1 : 1;
    }
}
