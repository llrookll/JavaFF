/**
 * Created by llRooKll on 3/28/2017.
 */
public class AssociationList<Key, Value> {
    private Node node;

    public AssociationList() {
    }

    public Value get(Key key) {
        boolean foundkey = false;
        while (!foundkey) {
            if (key == node.key) {
                foundkey = true;
                return node.value;
            } else {
                node = node.next;
            }
        }
        throw new IllegalArgumentException("ERROR");
    }

    private boolean isEqual(Key leftKey, Key rightKey) {
        return leftKey == rightKey;
    }

    public void put(Key key, Value value) {
        if (node == null) node = new Node(key, value, node);
        else if (node.key.equals(key)) node.value = value;
        else node = new Node(key, value, node);
    }

    public boolean isIn(Key k) {
        while (node.key != k) {
            try {
                node = node.next;
            } catch (Exception i) {
                break;
            }
        }
        return true;
    }

    private class Node {
        private Key key;
        private Value value;
        private Node next = null;

        private Node(Key object, Value value, Node next) {
            this.key = object;
            this.value = value;
            this.next = next;
        }
    }
}

class main{

    public static void main(String [] args)
    {
        AssociationList<String,String> list = new AssociationList<String,String>();

        list.put("Harry",     "Ginny");
        list.put("Ron",       "Lavender");
        list.put("Voldemort", null);
        list.put(null,        "Wormtail");

        System.out.println(list.isIn("Harry"));      //  true          2 points.
        System.out.println(list.isIn("Ginny"));      //  false         2 points.
        System.out.println(list.isIn("Ron"));        //  true          2 points.
        System.out.println(list.isIn("Voldemort"));  //  true          2 points.
        System.out.println(list.isIn(null));         //  true          2 points.
        System.out.println(list.isIn("Joanne"));     //  false         2 points.

        System.out.println(list.get("Harry"));       //  Ginny         2 points.
        System.out.println(list.get("Ron"));         //  Lavender      2 points.
        System.out.println(list.get("Voldemort"));   //  null          2 points.
        System.out.println(list.get(null));          //  Wormtail      2 points.

        try
        {
            System.out.println(list.get("Joanne"));
        }
        catch (IllegalArgumentException ignore)
        {
            System.out.println("No Joanne");           //  No Joanne     2 points.
        }

        list.put("Ron",   "Hermione");
        list.put("Albus", "Gellert");
        list.put(null,    null);


        System.out.println(list.isIn(null));         //  true          2 points.
        System.out.println(list.get("Albus"));       //  Gellert       2 points.
        System.out.println(list.get("Ron"));         //  Hermione      2 points.
        System.out.println(list.get(null));          //  null          2 points.
    }
}