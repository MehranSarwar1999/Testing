package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		WordOccurrences test = new WordOccurrences();
		int output = test.countA("And");
		assertEquals(1, output);  
	}

}
