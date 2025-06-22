package collections.comparision;

public class Item implements Comparable<Item> {
    private  String id;
    private String name;
    private  double price;
    private long quantity;
    private int serving;

    public Item(){

    }

    public Item(String id, String name, double price, long quantity, int serving){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.serving = serving;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public int getServing() {
        return serving;
    }

    public void setServing(int serving) {
        this.serving = serving;
    }

//    @Override
//    public int compareTo(Item o) {
//        if(this.price - o.price > 0) return  1;
//        if(this.price - o.price < 0) return -1;
//        return 0;
//    }

    @Override
    public int compareTo(Item o) {
        return this.name.compareTo(o.name);
    }
}
