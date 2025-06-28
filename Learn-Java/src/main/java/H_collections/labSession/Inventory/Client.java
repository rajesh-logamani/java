package H_collections.labSession.Inventory;

import H_collections.labSession.Item.Book;
import H_collections.labSession.Item.Electronics;
import H_collections.labSession.Item.Order;
import H_collections.labSession.Item.RecentlyViewedItem;

import java.util.LinkedList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Inventory<Book> bookInventory = new Inventory<>();
        bookInventory.add("K1", new Book("K1", "Java Programming", 50.0, 10, 5, "John Doe"));
        bookInventory.add("K2", new Book("K2", "Effective Java", 45.0, 8, 3, "Joshua Bloch"));
        bookInventory.add("K3", new Book("K3", "Clean Code", 40.0, 5, 2, "Robert C. Martin"));
        bookInventory.add("K4", new Book("K4", "Head First Java", 55.0, 7, 4, "Kathy Sierra"));


        List<Book>  allItems = bookInventory.ListItem();
        System.out.println("**********Item List**********");
        for(Book item : allItems){
            System.out.println(item.getName() + " || Price: " + item.getPrice() + " || Author: " + item.getAuthor());
        }

        bookInventory.remove("K3");
        System.out.println("Retrieve K2: " + bookInventory.retrieve("K2"));

        List<Book> itemList = bookInventory.ListItem();
        System.out.println("**********Item List**********");
        for(Book item : itemList){
            System.out.println(item.getName() + " || Price: " + item.getPrice() + " || Author: " + item.getAuthor());
        }

        /** Electronic Inventory */
        Inventory<Electronics> electronicInventory = new Inventory<>();
        electronicInventory.add("E1", new Electronics("E1", "Smartphone", 699.99, 20, 10, 3));
        electronicInventory.add("E2", new Electronics("E2", "Laptop", 1299.99, 15, 5, 2));
        electronicInventory.add("E3", new Electronics("E3", "Smartwatch", 199.99, 30, 20, 5));
        electronicInventory.add("E4", new Electronics("E4", "Tablet", 499.99, 25, 15, 4));
        List<Electronics> electronicItems = electronicInventory.ListItem();
        System.out.println("**********Electronic Item List**********");
        for(Electronics item : electronicItems){
            System.out.println(item.getName() + " || Price: " + item.getPrice() + " || Warranty: " + item.getWarranty() + " years");
        }
        electronicInventory.remove("E2");
        System.out.println("Retrieve E1: " + electronicInventory.retrieve("E1"));
        List<Electronics> electronicItemList = electronicInventory.ListItem();
        System.out.println("**********Electronic Item List**********");
        for(Electronics item : electronicItemList){
            System.out.println(item.getName() + " || Price: " + item.getPrice() + " || Warranty: " + item.getWarranty() + " years");
        }


        RecentlyViewedItem<Book> recentlyViewedBooks = new RecentlyViewedItem<>(new LinkedList<>());
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K1", "Java Programming", 50.0, 10, 5, "John Doe"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K2", "Effective Java", 45.0, 8, 3, "Joshua Bloch"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K3", "Clean Code", 40.0, 5, 2, "Robert C. Martin"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K4", "Head First Java", 55.0, 7, 4, "Kathy Sierra"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K5", "Java Concurrency in Practice", 60.0, 6, 3, "Brian Goetz"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K6", "Java: The Complete Reference", 70.0, 4, 2, "Herbert Schildt"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K7", "Java Performance: The Definitive Guide", 80.0, 3, 1, "Scott Oaks"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K8", "Java Network Programming", 90.0, 2, 1, "Elliotte Rusty Harold"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K5", "Java Concurrency in Practice", 60.0, 6, 3, "Brian Goetz"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K9", "Java Cryptography", 100.0, 1, 1, "David Hook"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K10", "Java I/O", 110.0, 1, 1, "Bert Bates"));
        recentlyViewedBooks.addRecentlyViewedItem(new Book("K11", "Java Design Patterns", 120.0, 1, 1, "James W. Cooper"));

        System.out.println("**********Recently Viewed Books**********");
        for(Book book : recentlyViewedBooks.getRecentlyViewedItem()){
            System.out.println("Id: " + book.getId() + "Name " + book.getName() + " || Price: " + book.getPrice() + " || Author: " + book.getAuthor());
        }

        Order order1 = new Order("O001", true);
        Order order2 = new Order("O002", false);
        Order order3 = new Order("O003", true);
        Order order4 = new Order("O004", false);
        Order order5 = new Order("O005", true);
        Order order6 = new Order("O006", false);
        Order order7 = new Order("O007", true);



    }
}
