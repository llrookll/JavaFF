package ClassInheritance;

/**
 * Created by Gas on 2/20/2017.
 */
public class Dog extends Animal {
    private int age;
    public Dog(){
        super("Woof");
    }
    public Dog(String call, int age) {
        super(call);
        this.age = age;
    }
    public int getAge() {
        return age;
    }

}
