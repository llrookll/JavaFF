package Set;

// Set class with double Array
public class Set<Key, Value>{
    private Key[] keys;
    private Value[] values;
    private int count;

    public Set(int length){
        if (length < 0)
            throw new IllegalArgumentException("...");
        count = 0;
        keys = (Key[]) new Object[length];
        values = (Value[]) new Object[length];

    }
    //working
    public Value get(Key key) {
//        for (int index = 0; index < count; index++) {
//            if (isEqual(keys[index],key))
//                    return values[index];
//        }
        int index = where(key);
        if (index != -1)
            return values[index];
        else
            throw new IllegalArgumentException("...");
    }
    private boolean isEqual(Key leftKey, Key rightKey){
        if (leftKey == null || rightKey == null){
            if (leftKey == rightKey) return true;
        }
        else if (leftKey.equals(rightKey)) {
            return true;
        }
        return false;
    }
    //working function
    public boolean isIn(Key key) {
        for (int index = 0; index < count; index++) {
            if (key == null) {
                if (keys[index] == null) return true;
            } else if (isEqual(keys[index],key)) {
                return true;
            }
        }
        return false;
    }

    public void put(Key key, Value value){
        if(!isIn(key)){
            if (count == keys.length) throw new IllegalStateException("...");
            keys[count] = key;
            values[count] = value;
            count++;
        }
        else{
            int index = where(key);
            values[index] = value;
        }
    }
    private int where(Key key) {
        for (int i = 0; i < count; i++) {
            if (isEqual(keys[i], key)) {
                return i;
            }
        }
        return -1;
    }

}
