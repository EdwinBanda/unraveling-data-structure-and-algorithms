package Map;

import LinkedList.Node;

public class HashTableSeparateChainning {
    private HashtableNode[] table;
    private int size = 16;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public HashTableSeparateChainning(){
        table = new HashtableNode[size];
    }

    public int getBucketIndex(String element){
        int hash = element.hashCode();
        if(size() != 0){
            return (hash & 0x7FFFFFFF) % size;

        }
        throw new IllegalArgumentException("Size should not be 0");
    }

    public void put(String key, int value){
        int index = getBucketIndex(key);
        HashtableNode entry = new HashtableNode(key,value);

        if(table[index] == null){
            table[index] = entry;
        }else{
            //Collision Case
            HashtableNode currentNode = table[index];
            while(currentNode.getNext() != null){
                if(currentNode.getKey().equals(key)){
                    currentNode.setValue(value);
                    return;
                }
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(entry);
//            this.size++;
        }
    }

    public HashtableNode get(String key){
        int index = getBucketIndex(key);
        HashtableNode currentNode = table[index];

        while (currentNode.getNext() != null){
            if(currentNode.getKey().equals(key)){
                return currentNode;
            }
        }
        return null;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder("[");
        for(int i = 0; i < this.size; i++){
            HashtableNode element = table[i];
            if(element != null){
                builder.append(element);
                builder.append(": {");
                while (element.getNext() != null){
//                    builder.append(element);
                    element = element.getNext();
                    if(element != null){
//                        builder.append(" -> ");
                    }
                }
                builder.append("}, ");
            }
        }
        if (builder.length() > 1) {
            builder.setLength(builder.length() - 2);
        }

        builder.append("]");
        return builder.toString();
    }
}
