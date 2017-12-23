package search;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

public class BinarySearchTester {
	
	private static BinarySearch sut;

	public static void main(String[] args) {
//		testEmpty();
//		testFalseN();
//		testTrueN();
//		testRandomN();
		
		shouldReturnFalseIfArrayIsEmpty();
		shouldReturnFalseIfNotFoundInSortedOddArray();
		shouldReturnFalseIfNotFoundInSortedEvenArray();
		shouldReturnTrueIfFoundAsFirstInSortedArray();
		shouldReturnTrueIfFoundAtEndInSortedArray();
		shouldReturnTrueIfFoundInMiddleInSortedArray();
		shouldReturnTrueIfFoundAnywhereInSortedArray();
		shouldReturnFalseIfNotFoundInSortedArray();
	}

	public static void shouldReturnFalseIfArrayIsEmpty() {
		sut = new BinarySearch();
		assertEquals(false, sut.find(new int[] {}, 1));
		sut = null;
	}

	public static void shouldReturnFalseIfNotFoundInSortedOddArray() {
		sut = new BinarySearch();
		assertEquals(false, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 9));
		sut = null;
	}

	public static void shouldReturnFalseIfNotFoundInSortedEvenArray() {
		sut = new BinarySearch();
		assertEquals(false, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 9));
		sut = null;
	}

	public static void shouldReturnTrueIfFoundAsFirstInSortedArray() {
		sut = new BinarySearch();
		assertEquals(true, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 0));
		sut = null;
	}

	public static void shouldReturnTrueIfFoundAtEndInSortedArray() {
		sut = new BinarySearch();
		assertEquals(true, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 16));
		sut = null;
	}

	public static void shouldReturnTrueIfFoundInMiddleInSortedArray() {
		sut = new BinarySearch();
		assertEquals(true, sut.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 8));
		sut = null;
	}

	// covers the 'true' cases above
	public static void shouldReturnTrueIfFoundAnywhereInSortedArray() {
		sut = new BinarySearch();
		int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

		for (int i = 0; i < sorted.length; i++) {
			assertEquals(true, sut.find(sorted, sorted[i]));
		}
		sut = new BinarySearch();
	}

	// covers the 'false' cases above
	public static void shouldReturnFalseIfNotFoundInSortedArray() {
		int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

		assertEquals(false, sut.find(sorted, sorted[0] - 1));
		for (int i = 0; i < sorted.length; i++) {
			assertEquals(false, sut.find(sorted, sorted[i] + 1));
		}
	}
	
	private static void testEmpty() {
		sut = new BinarySearch();
		for (int i = 0; i < 9; i++ ) {
			System.out.println(sut.find(new int[] {}, i));
		}
		sut = null;
	}

	private static void testFalseN() {
		sut = new BinarySearch();
		
		for (int i = 1; i <= 10; i++ ) {
			int[] tab = new int[i];
			
			for (int j = 0; j < i; j++) {
				tab[j] = j;
				sut.find(tab, j + 1);
			}
			tab = null;
		}
		sut = null;
	}
	
	private static void testTrueN() {
		sut = new BinarySearch();
		
		for (int i = 1; i <= 10; i++ ) {
			int[] tab = new int[i];
			
			for (int j = 0; j < i; j++) {
				tab[j] = j;
				sut.find(tab, j);
			}
			tab = null;
		}
		sut = null;
	}

	private static void testRandomN() {
		sut = new BinarySearch();
		Random rand = new Random();
		
		int[] tab = new int[1000];

		for (int i = 0; i < 1000; i++ ) {
			tab[i] = rand.nextInt(1000) + 0;
		}

		for (int i = 0; i < 1000; i++ ) {
			tab[i] = rand.nextInt(10) + 0;
			sut.find(tab, rand.nextInt(10) + 0);
		}
		sut = null;
	}
	
}
