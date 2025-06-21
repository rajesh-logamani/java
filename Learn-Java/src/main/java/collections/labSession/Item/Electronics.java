package collections.labSession.Item;

public class Electronics extends Item{
    public int warranty;

    public Electronics(String id, String name, double price, long quantity, int serving, int warranty){
        super(id, name, price, quantity, serving);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
