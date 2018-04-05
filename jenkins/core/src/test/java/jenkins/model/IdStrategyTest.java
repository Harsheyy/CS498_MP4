import static org.junit.Assert.*;
import javax.annotation.Nonnull;
import org.junit.Test;
import jenkins.model.IdStrategy;
import jenkins.model.IdStrategy.CaseInsensitive;

public class IdStrategyTest {
    @Test void test1() {
    	IdStrategy caseInsensitive = new CaseInsensitive();
    	String x = "hello";
    	assertEquals(caseInsensitive.idFromFilename(x),"hello");
    }
    
    @Test void test2() {
		IdStrategy caseInsensitive = new CaseInsensitive();
		assertTrue(caseInsensitive.idFromFilename("@/world") == "@world");
    }
}