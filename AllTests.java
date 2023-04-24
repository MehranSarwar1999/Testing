package Testing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ countATest.class, totalWordsTest.class })
public class AllTests {
 
}
