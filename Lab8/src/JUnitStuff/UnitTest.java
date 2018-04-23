package JUnitStuff;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
	@Test
	public void AddIntsTest() {
		Unit u = new Unit();
		int expected = 15;
		int actual = u.AddInts(10, 5);
		assertEquals(expected, actual);
		int expected1 = -15;
		int actual1 = u.AddInts(-10, -5);
		assertEquals(expected1, actual1);
	}
	@Test
	public void AddStringTest() {
		Unit u = new Unit();
		String x = "finals";
		String y = "suck";
		long AddString = (long)u.AddString(x, y).length();
		long expected = (long)10;
		assertEquals(expected,AddString);
	}
	@Test 
	public void findLenTest() {
		Unit u = new Unit();
		String x ="Finals";
		long len = (long)u.findLen(x).length();
		long expected = (long)10;
		assertEquals(expected,len);
	}
	@Test
	public void divXbyY() {
		Unit u = new Unit();
		int expected = 2;
		int actual = u.divXByY(4, 2);
		assertEquals(expected, actual);
		int expected1 = (Integer) null;
		int actual1 = u.divXByY(0, 2);
		assertEquals(expected1, actual1);
	}
	@Test
	public void reverseIntArrayTest() {
		Unit u = new Unit();
		int[] expected = {5,4,3,2,1};
		int[] numbers = u.reverseintArray(expected);
		assertEquals(expected, numbers);
	}
	@Test
	public void rangeTest() {
		Unit u = new Unit();
		int[] expected = {1,2,3,4};
		int actual = u.range(1, 4, 1);
		assertEquals(expected, actual);
	}
}