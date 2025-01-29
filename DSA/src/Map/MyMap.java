package Map;


import java.util.ArrayList;
import java.util.List;

public class MyMap<K, V>{
    private List<Entry<K, V>> entries = new ArrayList<>();
    private int size;

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    //Gets a corresponding value of a certain key
    public V get(K key){
        if(isEmpty()){
            throw new IllegalArgumentException("Its empty!");
        }
        for(Entry<K, V> entry: entries){
            if(key.equals(key)){
                return entry.getValue();
            }
        }
        return null;
    }
    //Adds entry inside the HashMap
    public void put(K key, V value){
        Entry<K, V> element = new Entry<>(key, value);
        entries.add(element);
    }

    //Removes entry from the hashMap
    public void remove(K key){
        entries.removeIf(kvEntry -> kvEntry.getKey().equals(key));
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("{");
        int i = 0;
        while (i <= entries.size()-2){
            builder.append(entries.get(i).getKey()).append(" = ").append(entries.get(i).getValue()).append(", ");
            i++;
        }
        builder.append(entries.get(i).getKey()).append(" = ").append(entries.get(i).getValue());
        builder.append("}");
        return builder.toString();
    }
}
