/**
 * GenericsA.java
 * Used to illustrate basic principles of generic types
 * and type safety in Java.
 */
public class GenericsA {

    /**
     * Make this method generic. Use a type variable named
     * T that will allow you to search through an array
     * of any type and return the location of target in a
     * or -1 if it doesn't exist.
     */
    public static int search(int[] a, int target) {
        int i = 0;
        while ((i < a.length) && (a[i] != target)) {
            i++;
        }
        if (i < a.length) {
            return i;
        }
        else {
            return -1;
        }
    }

  /** Drives execution. */
    public static void main(String[] args) {
        // You'll need to change these statements once
        // you make the search method generic.
        int[] a1 = {4, 10, 2, 8, 6};
        int i = GenericsA.search(a1, 8);
        System.out.println(i);
    }

}
