/**
 * ArrayBagClient.java
 * Provides a sample client of Bag behavior from
 * the ArrayBag class.
 *
 */
public class ArrayBagClient {
    /** Drives execution. */
    public static void main(String[] args) {
        Bag<Integer> bag = new ArrayBag<>();
        for (int i = 0; i < 10; i++) {
            bag.add(i);
        }
        System.out.println(bag);
    }
}
