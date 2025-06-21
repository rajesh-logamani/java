package collections.comparators;

import collections.labSession.Item.Item;

import java.util.Comparator;

public class QuantityComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        if (o1.getQuantity() < o2.getQuantity()) {
            return -1; // o1 is less than o2
        } else if (o1.getQuantity() > o2.getQuantity()) {
            return 1; // o1 is greater than o2
        } else {
            return 0; // o1 is equal to o2
        }
    }
}
