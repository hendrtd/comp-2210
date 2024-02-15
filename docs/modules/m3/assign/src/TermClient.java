/**
 * Client of the Term class.
 */
public class TermClient {

    /** Drives execution. */
    public static void main(String[] args) {
        Term hello = new Term("hello", 5);
        Term hi = new Term("hi", 2);
        System.out.println(hello + " " + hi + " " + hello.compareTo(hi));
        System.out.println(Term.byDescendingWeightOrder().compare(hello, hi));
        System.out.println(Term.byPrefixOrder(2).compare(hello, hi));
        System.out.println(Term.byPrefixOrder(1).compare(hello, hi));
    }
}
