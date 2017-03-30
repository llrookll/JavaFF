/**
 * Created by Gas on 3/29/2017.
 */
public class ArrayQueue<Base> {
    private int front;
    private int rear;
    private Base[] objects;

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return front == (rear + 1) % objects.length;
    }

    public void enqueue(Base object) {
        int nextRear = (rear + 1) % objects.length;
        if (front == nextRear) throw new IndexOutOfBoundsException();
        else ;
    }
}
