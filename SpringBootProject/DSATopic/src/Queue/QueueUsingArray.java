package Queue;

public class QueueUsingArray {
    private int queue[] = new int[5];
   private int rear = -1 , front = -1;

    public void enqueue(int item){

        rear = (rear + 1)%queue.length;

        if(front == rear){
            System.out.println("Queue is full");
            return;
        }else {
            queue[rear] = item;
            if(front == -1){
                front = rear;
            }
        }
    }
    public void printQueue(){
        return;
    }
    public int deQueue(){
        int temp =-1;
        if(rear == -1){
            System.out.println("Queue is empty");
        }else {
            temp = queue[front];
            if(front == rear){
                front = rear = -1;
            }
            front = (front+1)/queue.length;
        }

        return temp;

    }


}
