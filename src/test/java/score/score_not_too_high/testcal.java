package score.score_not_too_high;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcal {

	@Test
	public void testadd() {
		int exceptResult = 5;
		cal test_1 = new cal();
		assertEquals(exceptResult,test_1.add(2,3));
	}
	@Test
	public void testsub() {
		int exceptResult = -1;
		cal test_2 = new cal();
		assertEquals(exceptResult,test_2.sub(2,3));
	}
	@Test
	public void testmul() {
		int exceptResult = 6;
		cal test_3 = new cal();
		assertEquals(exceptResult,test_3.mul(2,3));
	}

}
