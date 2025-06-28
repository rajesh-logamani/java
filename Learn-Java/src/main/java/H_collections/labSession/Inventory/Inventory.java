package H_collections.labSession.Inventory;

import H_collections.labSession.Item.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory<T extends Item> {
    private HashMap<String, T> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void add(String key, T value){
        items.put(key,value);
    }

    public  void remove(String key){
        if(items.containsKey(key)){
            items.remove(key);
        }
    }

    public  T retrieve(String key){
        if(items.containsKey(key)){
            return items.get(key);
        }
        return null;
    }

//    public List<T> listItems() {
//        Collection<T> list = new ArrayList<>();
//        list = items.values();
//        return list;
//    }

    public List<T> ListItem(){
        List<T> list = new ArrayList<T>();

        for(T item : items.values()){
            list.add(item);
        }
        return list;
    }
}
