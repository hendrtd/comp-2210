import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit tests for shiftRight in the ArrayIndexedList class.
 *
 * @author Dean Hendrix (dh@auburn.edu)
 * @version 2018-04-03
 */
public class ArrayIndexedListTest {

	private ArrayIndexedList<String> list;

	private String feedback;

	@Before
	public void setup() {
		list = new ArrayIndexedList<String>(5);
		list.add("A");
		list.add("B");
		list.add("C");
		feedback = "\nExisting list: [A, B, C]. \n";
	}

	@Test
	public void testAdd0() {
		feedback += "add(D, 0)\n";
		String expected = "[D, A, B, C]";
		list.add("D", 0);
		String actual = list.toString();
		assertEquals(feedback, expected, actual);
	}

	@Test
	public void testAdd1() {
		feedback += "add(D, 1)\n";
		String expected = "[A, D, B, C]";
		list.add("D", 1);
		String actual = list.toString();
		assertEquals(feedback, expected, actual);
	}

	@Test
	public void testAdd2() {
		feedback += "add(D, 2)\n";
		String expected = "[A, B, D, C]";
		list.add("D", 2);
		String actual = list.toString();
		assertEquals(feedback, expected, actual);
	}


}
