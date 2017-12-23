package search;

import static org.junit.Assert.*;
import org.junit.*;

public class BinarySearchTest {

	private BinarySearch sut;

	@Before
	public void setUp() throws Exception {
		sut = new BinarySearch();
	}

	@Test
	public void shouldReturnFalseIfArrayIsEmpty() {
		assertEquals(false, sut.find(new int[] {}, 1));
	}

	@Test
	public void shouldReturnFalseIfNotFoundInSortedOddArray() {
		assertEquals(false, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 9));
	}

	@Test
	public void shouldReturnFalseIfNotFoundInSortedEvenArray() {
		assertEquals(false, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 9));
	}

	@Test
	public void shouldReturnTrueIfFoundAsFirstInSortedArray() {
		assertEquals(true, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 0));
	}

	@Test
	public void shouldReturnTrueIfFoundAtEndInSortedArray() {
		assertEquals(true, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 16));
	}

	@Test
	public void shouldReturnTrueIfFoundInMiddleInSortedArray() {
		assertEquals(true, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 8));
	}

	// covers the 'true' cases above
	@Test
	public void shouldReturnTrueIfFoundAnywhereInSortedArray() {
		int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

		for (int i = 0; i < sorted.length; i++) {
			assertEquals(true, sut.find(sorted, sorted[i]));
		}
	}

	// covers the 'false' cases above
	@Test
	public void shouldReturnFalseIfNotFoundInSortedArray() {
		int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

		assertEquals(false, sut.find(sorted, sorted[0] - 1));
		for (int i = 0; i < sorted.length; i++) {
			assertEquals(false, sut.find(sorted, sorted[i] + 1));
		}
	}

}
