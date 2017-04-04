public class ArrayStack<Base> {
    private Object[] objects;
    private int count;

    public ArrayStack(int length) {
        if (length < 0) throw new IllegalArgumentException("Length < 0");
        else {
            objects = new Object[length];
            count = 0;
        }
    }

    public static void main(String[] args) {
        ArrayStack<String> a = new ArrayStack<String>(10);
        a.push("A");
        a.pop();
        a.isEmpty();
        a.isFull();
        a.peek();
    }

    public void push(Base object) {
        if (isFull()) throw new IllegalStateException("Stack is full");
        else {
            objects[count] = object;
            count++;
        }
    }

    public void pop() {
        if (isEmpty()) throw new IllegalStateException("Stack is empty");
        else {
            count--;
            objects[count] = null;
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count >= objects.length;
    }

    public Base peek() {
        if (isEmpty()) throw new IllegalStateException("Stack is Empty");
        else return (Base) objects[count - 1];
    }

}
