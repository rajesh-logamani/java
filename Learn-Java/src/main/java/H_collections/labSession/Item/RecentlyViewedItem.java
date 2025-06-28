package H_collections.labSession.Item;

import java.util.HashMap;
import java.util.LinkedList;

public class RecentlyViewedItem<T extends Item> {
    LinkedList<T> recentlyViewedItem;
    private int MAX_LENGTH = 10;
    HashMap<String, T> itemMap;

    public RecentlyViewedItem(LinkedList<T> item) {
        this.recentlyViewedItem = item;
        this.itemMap = new HashMap<>();
    }

    public LinkedList<T> getRecentlyViewedItem() {
        return recentlyViewedItem;
    }

    public void addRecentlyViewedItem(T recentlyViewedItem) {
        System.out.println("Adding item to recently viewed list: " + recentlyViewedItem.getName());
        if (this.itemMap.containsKey(recentlyViewedItem.getId())) {
            // Item is already in the list
            T oldItem = this.itemMap.get(recentlyViewedItem.getId());
            System.out.println("Item already exists in the recently viewed list.");
            this.recentlyViewedItem.remove(oldItem);
        }
        if (this.recentlyViewedItem.size() >= MAX_LENGTH) {
            T removedItem = this.recentlyViewedItem.removeLast();
            this.itemMap.remove(removedItem.getId());
        }
        this.itemMap.put(recentlyViewedItem.getId(), recentlyViewedItem);
        this.recentlyViewedItem.addFirst(recentlyViewedItem);
    }
}
