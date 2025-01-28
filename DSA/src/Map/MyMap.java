package Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyMap<K, V>{
    private List<Entry<K, V>> entries;
    private int size;

    public MyMap(){
        this.entries = new ArrayList<>();
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return this.size() == 0;
    }
    //Get entry
    public V get(K key){
        if(isEmpty()){
            throw new IllegalArgumentException("Its empty!");
        }
        for(Entry<K, V> entry: entries){
            if(entry.getKey().equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }
    //Add entry
    public void put(K key, V value){
        for(Entry<K, V> entry: entries){
            if(entry.getKey().equals(key)){
                entry.setKey(key);
                return;
            }
        }
        entries.add(new Entry<>(key,value));
    }
    //Remove entry
    public void remove(K key){
        entries.removeIf(entry -> entry.getKey().equals(key));
    }

    @Override
    public String toString() {
        return "MyMap{" +
                "entries=" + entries +
                ", size=" + size +
                '}';
    }
}
