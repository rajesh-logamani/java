package collections.labSession.Item;

public class Clothing extends Item {
    public String size;

    public Clothing(String id, String name, double price, long quantity, int serving, String size){
        super(id, name, price, quantity, serving);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
