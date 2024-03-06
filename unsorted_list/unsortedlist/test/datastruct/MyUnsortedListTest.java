package datastruct;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnsortedListTest {
    @Test 
	public void testPopOneElem() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1);
		Integer res = 1;
		assertEquals(res, testList.pop());
		MyUnsortedList<Integer> testListAfter = MyUnsortedList.of();
		assertEquals("Pop avec une liste d'un seul élément echou",testListAfter, testList);
	}
	
	@Test
	public void testPopLast() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1,2,3);
		Integer res = 3;
		assertEquals("L'élément enlevé par popLast n'est pas bon",res, testList.popLast());
	}
	
	@Test
	public void testPopLastVerifierList() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1,2,3);
		MyUnsortedList<Integer> testListAfter = MyUnsortedList.of(1,2);
		testList.popLast();
		assertEquals("Le contenu de la liste après popLast n'est pas bon",testList,testListAfter);
	}
	
	@Test(expected = EmptyListException.class)
	public void testPopLastListVide() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of();
		testList.popLast();
	}
	
	@Test
	public void testPopLastListOneElem() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1);
		Integer pop = 1;
		assertEquals("PopLast avec liste d'un seul element echou",pop, testList.popLast());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveInvalideIndex() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1,2);
		testList.remove(-1);
	}
	
	@Test
	public void testRemoveElem() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1,2);
		Integer res = 2;
		assertEquals("L'élément enlevé par remove n'est pas bon",res, testList.remove(1));
	}
	
	@Test
	public void testRemoveElemVerifierList() {
		MyUnsortedList<Integer> testList = MyUnsortedList.of(1,2);
		MyUnsortedList<Integer> resList = MyUnsortedList.of(1);
		testList.remove(1);
		assertEquals("Le contenue après remove n'est pas bon",resList, testList);
	}
	
	@Test
	public void testEquals() {
		MyUnsortedList<Integer> testList1 = MyUnsortedList.of(1,2);
		MyUnsortedList<Integer> testList2 = MyUnsortedList.of(1,2);
		assertTrue("testEquals cas 2 listes equales echou",testList1.equals(testList2));
	}
	
	@Test
	public void testEqualsCase2() {
		MyUnsortedList<Integer> testList1 = MyUnsortedList.of(1,2);
		MyUnsortedList<Integer> testList2 = MyUnsortedList.of(1);
		assertFalse("testEquals cas 2 listes non equales echou",testList1.equals(testList2));
	}
}