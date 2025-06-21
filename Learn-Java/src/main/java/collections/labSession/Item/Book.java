package collections.labSession.Item;

public class Book extends Item {
    public String author;

    public Book(String id, String name, double price, long quantity, int serving, String author){
        super(id, name, price, quantity, serving);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}
