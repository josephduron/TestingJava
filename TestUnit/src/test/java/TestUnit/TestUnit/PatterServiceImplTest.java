package TestUnit.TestUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import svcImpl.PatterServiceImpl;

public class PatterServiceImplTest {

	@Test
	public void testComputeLPSArray() {
		
		String pat = "ABABCABAB";
		int M = pat.length();
		int[] lps = new int[pat.length()];
		String result = "";

		new PatterServiceImpl().computeLPSArray(lps, M, pat);

		for (int i = 0; i < lps.length; ++i) {
			result += lps[i] + " ";
		}

		assertEquals("0 0 1 2 0 1 2 3 4 ", result);
	}

	/*
	@Test
	public void getKPM() {
		fail("Not yet implemented");
	}
	*/

}
