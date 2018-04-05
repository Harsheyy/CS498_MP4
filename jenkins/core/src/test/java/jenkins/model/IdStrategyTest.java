package jenkins.model;

import org.junit.Test;

public class IdStrategyTest {
    @Test public void test1() {
    		string x = "word";
    		assertEquals("word", idFromFilename(word));
    }
    
    @Test public void test2() {
		string x = "test";
		assertEquals("test", idFromFilename(test));
    }
}