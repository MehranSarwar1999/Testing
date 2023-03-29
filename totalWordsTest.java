package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class totalWordsTest {

	@Test
	public void test() {
		WordOccurrences test = new WordOccurrences();
		int output = test.totalWords(5);
		assertEquals(25, output);
	}

}
