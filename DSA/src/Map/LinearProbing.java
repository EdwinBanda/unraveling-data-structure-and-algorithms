package Map;

public class LinearProbing {
    private HashtableNode[] table;
    private int size = 8;
    private int entriesCount = 0;

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }
    public boolean isFull(){
        return table.length == 16;
    }


    public LinearProbing(){
        table = new HashtableNode[size];
    }

    public int getBucketIndex(String key){
        int hash = key.hashCode();
        if(size() != 0){
            return (hash & 0x7FFFFFFF) % size;

        }
        throw new IllegalArgumentException("Size should not be 0");
    }

    public void put(String key, int value){
        int index = getBucketIndex(key);
        HashtableNode element = new HashtableNode(key, value);
//        System.out.println(table.length);
//        while (entriesCount != 16){
        for (int i = index; i < size; i++){
            if(entriesCount == size){
                throw new RuntimeException("Array buckets are full!");
            }
            System.out.println(table[i]);
            if(table[i] == null){
                table[i] = element;
                entriesCount++;
                return;
            }
            if(i == size){
                i = 0;
            }
        }

//        }
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
        for(int i = 0; i < size; i++){
                builder.append(table[i]).append(", ");
//            if(table[i] != null){
//            }
        }
        if (builder.length() > 1) {
            builder.setLength(builder.length() - 2);
        }

        builder.append("]");
        return builder.toString();
    }
}
