package CustomArrayList;

import java.util.Arrays;

public class OwnArrayList {
    int[] arr = {};
    int size = 0;

    public OwnArrayList(){
        arr = new int[10];
    }
    public void add(int data){
        if(size == arr.length){
            increaseCapacity();
        }
        arr[size] = data;
        size++;

    }

    private void increaseCapacity() {
        int newCapacity = (arr.length * 3)/2;
        arr = Arrays.copyOf(arr , newCapacity);
    }

    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public int get(int index){
        if(index<0 || index>=size){
            throw new IndexOutOfBoundsException("invalid index "+index);
        }
        return arr[index];
    }

}
