package H_collections.comparision;

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

/**
 *  Ascending
 *  if(o1<o2) return 1;
 *  if(o1>o2) return -1;
 *  if(o1 == o2) return 0;
 *
 *  Descending
 *  if(o1<o2) return -1;
 *  if(o1>o2) return 1;
 *  if(o1 == o2) return 0;
 *
 */
