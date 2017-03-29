class RunnyStack<Base> {
    private Run top;
    private int depth = 0;

    public RunnyStack() {
    }

    public int depth() {
        return depth;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Base peek() {
        if (isEmpty()) {
            throw new IllegalStateException(("stack is empty"));
        } else {
            return top.object;
        }
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException(("stack is empty"));
        } else {
            Run last = top;
            top = top.next;
            if (top == last)
                top.length--;
            depth--;
        }
    }

    public void push(Base object) {
        if (top == null) top = new Run(object, 1, top);
        else if (top.object.equals(object)) top = new Run(object, top.length, top);
        else {
            top = new Run(object, top.length, top);
            top.length++;
        }
        depth++;
    }

    public int runs() {
        if (top == null) {
            return 0;
        }
        return top.length;
    }

    class Run {
        private Base object;
        private int length;
        private Run next = null;

        private Run(Base object, int length, Run next) {
            this.object = object;
            this.length = length;
            this.next = next;
        }
    }


}

class Camembert {


    public static void main(String[] args) {
        RunnyStack<String> s = new RunnyStack<String>();

        System.out.println(s.isEmpty());         //  true       1 point
        System.out.println(s.depth());           //  0          1 point
        System.out.println(s.runs());            //  0          1 point

        try {
            s.pop();
        } catch (IllegalStateException ignore) {
            System.out.println("No pop");          //  No pop     1 point
        }

        try {
            System.out.println(s.peek());
        } catch (IllegalStateException ignore) {
            System.out.println("No peek");         //  No peek    1 point
        }

        s.push("A");
        System.out.println(s.peek());            //  A          1 point
        System.out.println(s.depth());           //  1          1 point
        System.out.println(s.runs());            //  1          1 point

        System.out.println(s.isEmpty());         //  false      1 point

        s.push("B");
        System.out.println(s.peek());            //  B          1 point
        System.out.println(s.depth());           //  2          1 point
        System.out.println(s.runs());            //  2          1 point

        s.push("B");
        System.out.println(s.peek());            //  B          1 point
        System.out.println(s.depth());           //  3          1 point
        System.out.println(s.runs());            //  2          1 point

        s.push("B");
        System.out.println(s.peek());            //  B          1 point
        System.out.println(s.depth());           //  4          1 point
        System.out.println(s.runs());            //  2          1 point

        s.push("C");
        System.out.println(s.peek());            //  C          1 point
        System.out.println(s.depth());           //  5          1 point
        System.out.println(s.runs());            //  3          1 point

        s.push("C");
        System.out.println(s.peek());            //  C          1 point
        System.out.println(s.depth());           //  6          1 point
        System.out.println(s.runs());            //  3          1 point

        s.pop();
        System.out.println(s.peek());            //  C          1 point
        System.out.println(s.depth());           //  5          1 point
        System.out.println(s.runs());            //  3          1 point

        s.pop();
        System.out.println(s.peek());            //  B          1 point
        System.out.println(s.depth());           //  4          1 point
        System.out.println(s.runs());            //  2          1 point

        s.pop();
        System.out.println(s.peek());            //  B          1 point
        System.out.println(s.depth());           //  3          1 point
        System.out.println(s.runs());            //  2          1 point

        s.pop();
        s.pop();
        System.out.println(s.peek());            //  A          1 point
        System.out.println(s.depth());           //  1          1 point
        System.out.println(s.runs());            //  1          1 point

        s.pop();
        System.out.println(s.isEmpty());         //  true       1 point
        System.out.println(s.depth());           //  0          1 point
        System.out.println(s.runs());            //  0          1 point

        try {
            System.out.println(s.peek());
        } catch (IllegalStateException ignore) {
            System.out.println("No peek");         //  No peek    1 point
        }
    }
}
