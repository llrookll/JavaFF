package Stack;

/**
 * Created by Gas on 3/20/2017.
 */
public class LinkedStack<Base> {
    private class Run {
        private Base object;
        private Run next;

        private Run(Base object, Run next) {
            this.object = object;
            this.next = next;
        }

    }

    private Run top;

    public LinkedStack() {
        top = null;
    }

    public void push(Base object) {
        top = new Run(object, top);
    }

    public void pop(){
        if(isEmpty()){
            throw new IllegalStateException(("stack is empty"));
        }
        else{
            top =top.next;
        }
    }
    public boolean isEmpty(){
        if(top == null){
            return true;
        }
        else{
            return false;
        }
    }
    public Run peek(){
        if(isEmpty()){
            throw new IllegalStateException(("stack is empty"));
        }
        else{
            return top;
        }
    }

    @Override
    public String toString(){
        return (String) top.object;
    }

    public static void main(String[] args) {


        LinkedStack<String> s = new LinkedStack<>();

        System.out.println(s.isEmpty());         //  true       1 point
        //System.out.println(s.depth());           //  0          1 point
        //System.out.println(s.runs());            //  0          1 point

        try {
            s.pop();
        } catch (IllegalStateException ignore) {
            System.out.println("No pop");          //  No pop     1 point
        }
        try
        {
            System.out.println(s.peek());
        }
        catch (IllegalStateException ignore)
        {
            System.out.println("No peek");         //  No peek    1 point
        }

        s.push("A");
        System.out.println(s.peek());            //  A          1 point
        System.out.println(s.isEmpty());         //  false      1 point

        s.push("B");
        System.out.println(s.toString());
       // System.out.println(s.peek());            //  B          1 point
        try {
            s.pop();
        } catch (IllegalStateException ignore) {
            System.out.println("No pop");          //  No pop     1 point
        }
        //System.out.println(s.peek());            //  A          1 point
        System.out.println(s.toString());
    }

}
