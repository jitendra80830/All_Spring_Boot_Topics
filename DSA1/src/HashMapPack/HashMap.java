package HashMapPack;

import java.util.ArrayList;

public class HashMap<K,V>{
    public class Node{
        K key;
        V value;
        Node next;
        public Node(K k , V v){
            this.key = k;
            this.value  = v;
        }
    }
    private int size = 0;
    ArrayList<Node> bucketArray;
    public HashMap(int len){
        bucketArray = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            bucketArray.add(null);
        }
    }
    public HashMap(){
        this(4);
    }
    public void put(K key , V value){
        int bucketNo = hashFunction(key);
        Node temp = this.bucketArray.get(bucketNo).next;
        while (temp!=null){
            //update value if key is already present
            if(temp.value.equals(value)){
                temp.value = value;
                return;
            }
            temp = temp.next;
        }
        this.size++;
        Node node = new Node(key ,value);
        node.next = this.bucketArray.get(bucketNo);
        this.bucketArray.add(bucketNo , node);



    }
    public int hashFunction(K key){
        int index = key.hashCode();
        return index;
    }
}
