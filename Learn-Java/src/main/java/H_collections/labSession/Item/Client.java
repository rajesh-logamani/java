package H_collections.labSession.Item;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Item> itemList = new ArrayList<Item>();

        itemList.add(new Clothing("C001", "T-Shirt", 19.99, 100, 1, "M"));
        itemList.add(new Book("B001", "Effective Java", 45.00, 50, 1, "Joshua Bloch"));
        itemList.add(new Clothing("C002", "Jeans", 49.99, 75, 1, "L"));
        itemList.add(new Book("B002", "Clean Code", 40.00, 60, 1, "Robert C. Martin"));
        itemList.add(new Clothing("C003", "Jacket", 89.99, 30, 1, "XL"));

        System.out.println("************Item List*************");
        for(Item item : itemList){
            System.out.println("Name: " + item.getName() + " || Price: " + item.getPrice());
        }

        Collections.sort(itemList);

        System.out.println("**************Sorted*************");
        for(Item item : itemList){
            System.out.println(item.getName() + " || Price: " + item.getPrice());
        }
    }
}
