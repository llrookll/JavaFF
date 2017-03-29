package Stack;/*
import sun.security.util.Length;

*/
/**
 * Created by Gas on 3/22/2017.
 *//*

public class ArrayStack<Base> {
    private Object[] objects;
    private int count;
    public ArrayStack(int length){
        if (length < 0){
            throw new  IllegalArgumentException((""));
        }
        else {
            objects = new Object[length];
            count = 0;
        }
    }
    public void push(Base object){
        if(isfull()){
            throw new IllegalStateException("full");
        }
        else{
            objects[count] = object;
            count ++;
        }
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean  isfull(){
        return count >= objects.length;
    }
    public void pop(){
        if(isEmpty()){
            throw new IllegalStateException("Empty");
        }
        else{
            count --;
            objects[count] = null;
        }
    }

    public Base peak{
        if (isEmpty()){
            throw new IllegalStateException(("Empty"));
        }
        else (Base)return objects[count - 1];
    }
}
*/
