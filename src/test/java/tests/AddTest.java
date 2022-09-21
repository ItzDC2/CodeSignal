package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dad.codesignal.EdgeOfTheOcean;
import dad.codesignal.TheJourneyBegins;

public class AddTest {

	private TheJourneyBegins tjb;
	private EdgeOfTheOcean eoto;
	
	@Before
	public void setUp() throws Exception {
		tjb = new TheJourneyBegins();
		eoto = new EdgeOfTheOcean();
	}

	@Test
	public void test() {
		assertEquals(2, tjb.add(1, 1));
	}
	
	@Test 
	public void testSiglo() {
		assertEquals(21, tjb.centuryFromYear(2022));
	}

	@Test 
	public void testPalindromo() {
		assertEquals(true, tjb.esPalindromo("22"));
	}
	
	@Test 
	public void testPalindromo2() {
		assertEquals(false, tjb.esPalindromo("2022"));
	}
	
	@Test
	public void testAdjacentProduct() {
		int[] array = {10, -8, 9, 3};
		assertEquals(27, eoto.getLargestProduct(array));
	}
//	
//	@Test
//	public void testGetArea() {
//		assertEquals(1, eoto.getAreaOfInterestingPolygon(1));
//	}
	
	
}
